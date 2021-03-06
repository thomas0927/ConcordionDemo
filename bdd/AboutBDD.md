# BDD不只是自动化测试
在Ruby社区中，测试和BDD一直是一个被热议的话题，不管是单元测试，集成测试和功能测试，你总能找到能帮助你的工具，Cucumber就是被广泛使用的工具之一。许多团队选择Cucumber的原因是“团队要BDD”，也就是行为驱动开发(Behavior. Driven Development)，难道用了Cucumber之后团队就真的BDD了么？

## 问题来了
事情当然没这么简单了，BDD作为一种软件开发方法论，一定要理解其含义并且遵循特定的流程，工具只不过是起辅助作用而已。会切菜的不一定都是厨子，会写代码的不一定都是程序员。近期Cucumber的作者Aslak也在博客中提到

	在BDD出现的10年后，依然有不少团队在使用BDD时出现问题……BDD依然经常被人误解成单纯的测试，或者是一个可以被下载的工具。

同时，Aslak也吐槽了Cucumber目前的处境

	就在最近，Cucumber已经被下载了超过500万次，我很高兴它如此受欢迎，同时也为它被广泛的误用而感到失望……Cucumber有时依然被错误的当成了自动化测试工具，而不是我当时创建的东西。
	
那么问题来了，怎样在日常项目中使用Cucumber呢？真的能在日常项目中进行BDD开发么？要回答这个问题，我们需要重新认识一下BDD。

### BDD的提出

2003年，开发人员Dan North偶然间发现把测试的标题经过简单的文字处理可以更好表达代码蕴含的业务逻辑，比如下面这段代码，

	public class CustomerLookupTest extends TestCase{
	    testFindsCustomerById() {
	        ...
	    }
	    testFailsForDuplicateCustomers() {
	        ...
	    }
	}

当我们把测试方法中的test去掉，给单词加上空格，然后把他们组合在一起时，就会出现：

	CustomerLookup
	 - finds customer by id
	 - fails for duplicate customers
	 - ...

在Dan看来，这无疑是对CustomerLookup类的描述，并且是用测试内容来描述代码中类的行为。Dan发现他似乎找到了一种方式，可以在TDD的基础上，通过测试来表达代码的行为。在尝到甜头后，Dan写了JBehave，一个更关注代码行为的工具来代替JUnit进行软件开发。经过一番折腾后，Dan觉得只描述类行为不过瘾，便开始把关注点从类扩展到整个软件，他和当时项目组的业务人员一起把需求转化成Given/When/Then的三段式，然后用JBehave写成测试来描述软件的某种行为。当测试完成后，开发人员才开始编码，一旦测试通过，那软件就完成了测试中描述的某种行为。在他看来，他把TDD升级了，因为他不再只关注于局部类的方法，而开始关注整个软件的行为。

通过这种方式，Dan成功的把需求转换成了软件的功能测试，先写功能测试再驱动出产品代码，保证软件行为正确性。其次，Dan强调在测试中要尽可能的使用业务词汇，保证团队成员对业务理解一致。于是，**BDD就此诞生**。

## 逐步演进

### BDD不只是自动化测试

在上面的故事中，“测试”这个词出现了很多次，你是不是已经认为BDD就是用功能测试驱动产品代码的开发流程呢？其实不然，功能测试只是一个结果而已，更重要的是和业务人员一起分析需求，沟通交流来产生测试的过程。用测试驱动出来的代码可以保证是正确的，但如何保证测试是正确的呢？答案就是人，通过业务，开发和测试一起参与生成的测试文档，不仅能保证软件功能上是正确的，还能保证团队成员对业务理解是一致的。在测试文档中，也应该尽量保证使用自然语言和业务词汇，减少非技术人员的学习成本。
在多年之后，Dan也终于给出了他对**BDD的定义**

	BDD是第二代的、由外及内的、基于拉(Pull)的、多方利益相关者的(Stakeholder)、多种可扩展的、高自动化的敏捷方法。它描述了一个交互循环，可以具有带有良好定义的输出（即工作中交付的结果）：已测试过的软件。

Cucumber的另一位作者Matt Wynne也给出了**自己的定义**

	BDD的实践者们通过沟通交流，具体的示例和自动化测试帮助他们更好地探索，发现，定义并驱动出人们真正想用的软件
	
从上述定义我们可以看出，BDD更强调流程和一系列实践，自动化测试只是其中一部分而已。

## 优秀的文档

### Concordion VS Cucumber

随着BDD的发展，越来越多的工具进入了我们的视野。我们应该认清团队的需求，结合团队的特点选择合适工具，不要盲目的随大流。下面我来列举一些具有代表性的工具，推荐给不同类型的团队。

**Cucumber**

简单来说，Cucumber实际上是一款有一定文档性，可以帮助团队沟通合作的，提供自动化测试功能的工具。特点是上手简单，社区活跃，文档表现力不足。所以如果团队刚开始尝试BDD，更看重在自动化测试方面，而对需求文档化要求不高时，团队有将自然语言转换为Given/When/Then的Specification文件的能力和时间，Cucumber是一个不错的选择。同时Cucumber目前支持Ruby, C#, JVM, JS和C++，众多平台也是一个加分项。

**Concordion**

与Cucumber相比，Concordion提供了更好的文档支持。Concordion的Specification是HTML格式的，我们再也不用生搬硬套的使用Given/When/Then进行功能描述了。在HTML文件中，我们可以更加自由的描述业务需求，同时可以增加好看的样式，添加更友好的交互，放入更多的视频和图片等等。总而言之一句话，HTML比纯文本更加灵活强大，适合阅读。同时我们也要清楚HTML的学习和维护成本相比纯文本更加昂贵，非技术的人可能很难单独完成。和技术人员结对完成，或者在技术人员完成后进行审查也是一个不错的选择。但由于Concordion目前只对C#和JAVA支持较好，所以如果团队刚好用到C#和Java，并且非常看重文档化需求，那么Concordion要比Cucumber更加适合你们。

交互性更好地需求文档，内容组织合理，阅读体验好。

** 目前的需求还需要补充各交互动作中，商户上传其他哪些信息的说明，这些说明分为两个层面：**

1.  要能让商户知道正确上传哪些必要的信息可以得到成功的返回，及相关扩展场景下如何上送信息
1.  需要提供反例，什么情况下会出错，及此场景下商户要做什么
