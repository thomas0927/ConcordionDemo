# 分割名称

需要描述：为了使我们的邮件个性化，我们希望拥有客户的名字和姓氏。不幸的是，我们提供的客户数据只包含全名。

因此，系统试图通过分割空白来将提供的全名分解为其成分。

### [基础用例，作冒为烟测试使用](- "basic")
全名 [Jane Smith](- "#name") 将被 [拆分](- "#multiValueResult = split(#name)") 成姓氏[Smith](- "?=#multiValueResult.lastName")和名字  [Jane](- "?=#multiValueResult.firstName")。

### [批量测试1](- "simple-names1")
| [split][][说明](- "c:example")			| [全名][full]  		  | [名字][first] 		| [姓氏][last]		|
| ---------------                       | -------------       | ---------------     | ---------------   |
| Simple name                           | David Peterson      | David               | Peterson          |
| Double-barrelled name                 | Mike Cannon-Brookes | Mike                | Cannon-Brookes    |

[split]: - "#multiValueResult = split(#fullName)"
[full]: - "#fullName"
[first]: - "?=#multiValueResult.firstName"
[last]:  - "?=#multiValueResult.lastName"
