# firstSpring
Spring框架学习
# Spring简介
Spring 是一个开源的轻量级 Java SE（ Java 标准版本）/Java EE（ Java 企业版本）开发应用框架  
Spring 框架除了帮我们管理对象及其依赖关系，还提供像通用日志记录、性能统计、安全控制、异常处理等面向切面的能力，可以帮我们管理最头疼的数据库事务
# 名词解释
* POJO ： POJO （ Plain Ordinary Java Object ）简单的 Java 对象
* Ioc：控制反转：即 Inversion of Control 。就是由容器控制程序之间的关系，而非传统实现中，由程序代码直接操控。

# Spring框架作用
* 根据配置文件创建及组装对象直接的依赖关系
* Spring 面向切面编程能无耦合的实现日志记录、性能统计、安全控制
* 管理数据库事务
* 与第三方数据库访问框架（如 Hibernate、JPA ）无缝集成
* 与第三方 Web（如 Struts、JSF ）框架无缝集成

## 松耦合 
当需要输出改变时，不必修改任何代码 .java 文件，只要修改 Spring-Output.xml 文件 <property name="outputGenerator" ref="CsvOutputGenerator" /> 中的 ref 值，就可以实现输出不同的内容，不修改代码就减少了出错的可能性。

## IoC容器
* Ioc容器  
传统 Java SE 程序设计，我们直接在对象内部通过 new 进行创建对象，是程序主动去创建依赖对象；而IoC 是有专门一个容器来创建这些对象，即由 IoC 容器来控制对象的创建  
被注入对象依赖 IoC 容器配置依赖对象  
* Bean属性注入value  
  Bean的定义有三种方式
  * 基于XML的配置
  * 基于注解的配置
  * 基于Java类的配置
* 内部嵌套的bean
  * 内部嵌套的 Bean 支持属性（ property ）注入和构造函数（ constructor - arg ）注入。
* 集合类型的bean
* Bean的作用域  默认是单例模式 
  * singleton — 单例模式，由 IOC 容器返回一个唯一的 bean 实例
  * prototype — 原型模式，被请求时，每次返回一个新的 bean 实例
  * request — 每个 HTTP Request 请求返回一个唯一的 Bean 实例
  * session — 每个 HTTP Session 返回一个唯一的 Bean 实例
  * globalSession — Http Session 全局 Bean 实例
* Spring注解的配置
* Spring Bean的生命周期  
Spring框架中，一旦把一个Bean纳入Spring IOC容器之中，这个Bean的生命周期就会交由容器进行管理  
  * Bean的建立， 由BeanFactory读取Bean定义文件，并生成各个实例
  * Setter注入，执行Bean的属性依赖注入
  * BeanNameAware的setBeanName(), 如果实现该接口，则执行其setBeanName方法
  * BeanFactoryAware的setBeanFactory()，如果实现该接口，则执行其setBeanFactory方法
  * BeanPostProcessor的processBeforeInitialization()，如果有关联的processor，则在Bean初始化之前都会执行这个实例的processBeforeInitialization()方法
  * InitializingBean的afterPropertiesSet()，如果实现了该接口，则执行其afterPropertiesSet()方法
  * Bean定义文件中定义init-method
  * BeanPostProcessors的processAfterInitialization()，如果有关联的processor，则在Bean初始化之前都会执行这个实例的processAfterInitialization()方法
  * DisposableBean的destroy()，在容器关闭时，如果Bean类实现了该接口，则执行它的destroy()方法 -Bean定义文件中定义destroy-method，在容器关闭时，可以在Bean定义文件中使用“destory-method”定义的方法  
 ![image](https://github.com/GuchaoGit/firstSpring/blob/master/images/lifecycle.png)

