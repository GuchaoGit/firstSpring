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
 ## Spring自动扫描与自动装配
  * @Component 表示这个 Class 是一个自动扫描组件
  * @Autowired 自动装配
  * 配置文件 SpringCustomer.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/beans 
            http://www.springframework.org/schema/beans/spring-beans.xsd">

    <context:component-scan base-package="com.guc.fristspring.autoscan"/>

</beans>
```
 ###自动扫描组件的注释类型
   * @Component ——表示一个自动扫描 component
   * @Repository ——表示持久化层的 DAO component
   * @Service ——表示业务逻辑层的 Service component
   * @Controller ——表示表示层的 Controller component
 ###自动扫描中过滤组件
 * Filter Component - include
 这些组件只要匹配定义的“ regex ”的命名规则，Class 前就不需要用 @Component 进行注释  
 ```
 <context:include-filter type="regex" 
                        expression="com.guc.fristspring.autoscan.services.*Service.*" />
 ```
 * Filter Component——exclude  
 也可以用 exclude ，制定组件避免被 Spring 发现并被注册到容器中
 ```
 <!-- 排除用 @Service 注释过的组件 -->
 <context:exclude-filter type="annotation" 
             expression="org.springframework.stereotype.Service" />     
 ```
 ###自动装配Bean  autowire
自动装配，就是将一个 Bean 注入到其他 Bean 的 Property 中  
五种装配模式：
* no —— 默认情况下，不自动装配，通过 ref attribute 手动设定
* byName —— 根据 Property 的 Name 自动装配
* byType —— 根据 Property 的数据类型（ Type ）自动装配
* constructor —— 根据构造函数参数的数据类型，进行 byType 模式的自动装配
* autodetect —— 如果发现默认的构造函数，用 constructor 模式，否则，用 byType 模式

## Spring AOP 面向切面编程 (Aspect-oriented programming)
* AOP(面向切面编程)  
面向切面编程，是作为面向对象编程的一种补充，专门用于处理系统中分布于各个模块（不同方法）中的交叉关注点的问题。就是一个拦截器（ interceptor ）拦截一些处理过程。  
支持4种类型的通知（Advice）
  * Before advice - method 执行前通知(MethodBeforeAdvice)  
  * After returning advice - method 返回一个结果后通知(AfterReturningAdvice)
  * After throwing advice - method 抛出异常后通知(ThrowsAdvice)
  * Around advice - 环绕通知，结合了以上三种(MethodInterceptor)
* AOP通知----Advice 表示一个 method 执行前或执行后的动作
* Pointcut----表示根据 method 的名字或者正则表达式去拦截一个 method
  *Pointcut - Name match：
  ```
  <!--通过方法名设置拦截点-->
  <bean id="customerPointcut"
          class="org.springframework.aop.support.NameMatchMethodPointcut">
          <property name="mappedName" value="printName" />
  </bean>
  ```
  *Pointcut - Regular exxpression match:
  ```
    <!--通过正则设置拦截点-->
    <bean id="customerAdvisor2" class="org.springframework.aop.support.RegexpMethodPointcutAdvisor">
        <property name="patterns">
            <list>
                <value>.*URL.*</value>
            </list>
        </property>
        <property name="advice" ref="hiAfterMethod" />
    </bean>
    
  ```
* Advisor----Advice 和 Pointcut 组成的独立的单元，并且能够传给 proxy factory 对象
* 自动创建Proxy
* AspectJ框架  
基于注解（Annotation）实现的，支持的注解类型有：
  * @Before
  * @After
  * @AfterReturning
  * @AfterThrowing
  * @Around  
通过注解实现Advice 和 Pointcut


