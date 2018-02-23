# 简介

## 背景
我的使用testng编写自动化测试工具的时候，想到了验证的目的是为了满足业务的需求，此前曾经使用过Cucumber进行BDD的测试练习，但是语法有点生硬，没有引入到团队中，这次使用Concordion作为BDD的底层框架，因为其提供的文档语言更趋于自然语言，对产品团队拆分需求的要求较低，而且文档呈现的效果更好。

## 工程说明
我提供了Concordion的基本能力，及用例耗时统计、Excel表格的扩展示例。更多内容请参阅
[Concordion的官方文档](http://concordion.org/tutorial/java/markdown/)。

Concordion采用[markdown语法](http://www.markdown.cn/)编写业务驱动文档。

**下载后使用Maven编译，在target/concordion/com/umpay/test/bdd/Index.html入口查看文档。**

基本要求：
1. src/test目录下编写测试用例，如com.umpay.test.bdd.IndexFixture.java
1. 类文件命名规范：可以说**Index.java、IndexFixture.java、IndexTest.java**
1. src/test/resources目录下，创建于类同目录结构且名称相同的markdown文档
1. src/test/resources目录下，创建于类同目录结构且名称相同的markdown文档，如 com/umpay/test/bdd/Index.md
1. 文档命名规范：与类名相同，只是扩展名为md
1. 工程POM文件中引用concordion，并且需要使用jdk1.8，工程中所有测试类继承了BaseFixture，将支持测试耗时统计和并行测试能力
1. 与jUnit最大的区别是，concordion的测试用例需要在markdown文档中关联，并且被文档主动使用。

## Concordion 在实际跨境产品需求中的使用示例
通过本示例是希望帮助大家了解如何使用Concordion，同时为了让BDD更好的运用的项目组中，我从跨境产品需求中截取了一部分需求，使用BDD的方式编写了示例化需求文档，也在github中放了一个[umfBDD使用示例](https://github.com/thomas0927/umfBDD)。