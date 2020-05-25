## Banking Customer Form

本规范使用银行客户表单的验证检查。 我们将增加更多的用例作为本项目其余部分的一个运行示例。

### [验证名字](- "验证名字 1")

输入 [Andrew]( - "#firstName") 名字验证结果为 [valid](- "c:assert-true=checkFirstName(#firstName)").

输入 [David]( - "#firstName") 名字验证结果为 [valid](- "c:assert-true=checkFirstName(#firstName)").

输入 [Steven]( - "#firstName") 名字验证结果为 [valid](- "c:assert-true=checkFirstName(#firstName)").

输入 [Stephen]( - "#firstName") 名字验证结果为 [valid](- "c:assert-true=checkFirstName(#firstName)").

输入 [12345]( - "#firstName") 名字验证结果为 [valid](- "c:assert-false=checkFirstName(#firstName)").

输入 Empty String 名字验证结果为 [invalid](- "c:assert-false=checkFirstNameAsEmptyString()").

输入 null 名字验证结果为 [invalid](- "c:assert-false=checkFirstNameAsNull()").

输入 [Pr@sh@nt]( - "#firstName") 名字验证结果为 [invalid](- "c:assert-false=checkFirstName(#firstName)").


### [验证邮箱](- "验证邮箱 2")

输入 [foooooooooo]( - "#email") 验证结果为 [invalid](- "c:assert-false=checkEmail(#email)").

输入 [fo@ooooooo@oo@]( - "#email") 验证结果为[invalid](- "c:assert-false=checkEmail(#email)").

输入 [joe@gmail.com]( - "#email") 验证结果为[valid](- "c:assert-true=checkEmail(#email)").

输入 [joe@]( - "#email") 验证结果为[invalid](- "c:assert-false=checkEmail(#email)").

输入 [@gmail]( - "#email") 验证结果为[invalid](- "c:assert-false=checkEmail(#email)").

输入 [joe@#gmail]( - "#email") 验证结果为[invalid](- "c:assert-false=checkEmail(#email)").

输入 [jAE$#AAA@#$RF]( - "#email") 验证结果为[invalid](- "c:assert-false=checkEmail(#email)").

输入 [joe@@mail.com]( - "#email") 验证结果为[invalid](- "c:assert-false=checkEmail(#email)").

### [验证日期格式](- "example 3")

输入 [12-12-2012]( - "#date") 验证结果为[valid](- "c:assert-true=checkDateFormat(#date)").

输入 [2SW#$#RFER$ES]( - "#date") 验证结果为[invalid](- "c:assert-false=checkDateFormat(#date)").

输入 [01-01-1999]( - "#date") 验证结果为[valid](- "c:assert-true=checkDateFormat(#date)").

输入 [01-01-01-2011]( - "#date") 验证结果为[invalid](- "c:assert-false=checkDateFormat(#date)").

输入 [03-11-2011]( - "#date") 验证结果为[valid](- "c:assert-true=checkDateFormat(#date)").

输入 [2012-15]( - "#date") 验证结果为[invalid](- "c:assert-false=checkDateFormat(#date)").

输入 [2-Jan-2012]( - "#date") 验证结果为[invalid](- "c:assert-false=checkDateFormat(#date)").

### [验证邮编](- "example 4")

输入 [6011]( - "#input") 验证结果为[valid](- "c:assert-true=checkValidPostCode(#input)").

输入 [1011]( - "#input") 验证结果为[valid](- "c:assert-true=checkValidPostCode(#input)").

输入 [9980]( - "#input") 验证结果为[valid](- "c:assert-true=checkValidPostCode(#input)").

输入 [45615611]( - "#input") 验证结果为[invalid](- "c:assert-false=checkValidPostCode(#input)").

输入 [15500]( - "#input") 验证结果为[invalid](- "c:assert-false=checkValidPostCode(#input)").
