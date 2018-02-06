# 模糊匹配

用户名查找时支持模糊匹配，即返回包含搜索字符串的所有用户名。

### [基础用例](- "beatles")

在下列用户中:

| [setup][] [用户列表][user]|
|------------------------------------------|
| john.lennon |
| ringo.starr |
| george.harrison |
| paul.mccartney |

[setup]: - "setUpUser(#username)"
[user]:   - "#username"

查找 [arr](- "#searchString") 得到的结果:

| [search][] [匹配的用户][match]|
|------------------------------------------|
| george.harrison |
| ringo.starr |

[search]: - "c:verify-rows=#username:getSearchResultsFor(#searchString)"
[match]: - "?=#username"