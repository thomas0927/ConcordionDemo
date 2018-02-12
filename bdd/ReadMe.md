# 简介

## 背景
我的使用testng编写自动化测试工具的时候，想到了验证的目的是为了满足业务的需求，此前曾经使用过Cucumber进行BDD的测试练习，但是语法有点生硬，没有引入到团队中，这次使用Concordion作为BDD的底层框架，因为其提供的文档语言更趋于自然语言，对产品团队拆分需求的要求较低，而且文档呈现的效果更好。

## 工程说明
我提供了Concordion的基本能力，及时间、Excel表格的扩展示例。更多内容请参阅
[Concordion的官方文档](http://concordion.org/tutorial/java/markdown/)。

Concordion采用markdown语法编写业务驱动文档，
基本要求：
1. src/test目录下编写测试用例，如com.umpay.test.bdd.IndexFixture.java
1. 类文件命名规范：可以说**Index.java、IndexFixture.java、IndexTest.java**
1. src/test/resources目录下，创建于类同目录结构且名称相同的markdown文档