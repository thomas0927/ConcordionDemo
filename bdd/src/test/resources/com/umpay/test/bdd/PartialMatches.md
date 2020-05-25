# PartialMatches

用户名查找时支持模糊匹配，即返回包含搜索字符串的所有用户名。

### [基础用例](- "beatles")

在下列用户中:

| [初始化一个][] [用户列表][user]|
|------------------------------------------|
| john.lennon | 
| ringo.starr | 
| george.harrison | 
| paul.mccartney | 

[初始化一个]: - "setUpUser(#username)"
[user]:   - "#username"

查找 [arr](- "#searchString") 得到的结果:

| [search][] [匹配的用户][match]|
|------------------------------------------|
| george.harrison |
| ringo.starr |

[search]: - "c:verify-rows=#username:getSearchResultsFor(#searchString)"
[match]: - "?=#username"

### [增强用例](- "beatles2")

| [初始化一组][] [用户列表集合][users]|
|------------------------------------------|
| john.lennon,ringo.starr,george.harrison,paul.mccartney |

[初始化一组]: - "setUpUsers(#usernames)"
[users]:   - "#usernames"

查找 [arr](- "#searchString") 得到的结果:

| [searchStr][] [匹配的用户][matchStr]|
|------------------------------------------|
| george.harrison |
| ringo.starr |

[searchStr]: - "c:verify-rows=#usernameStr:getSearchResultsForStr(#searchString)"
[matchStr]: - "?=#usernameStr"