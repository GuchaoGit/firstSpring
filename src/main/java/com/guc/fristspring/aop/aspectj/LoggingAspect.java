package com.guc.fristspring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author guc
 * @Date 2020/1/9 10:00
 * @Description 简单的 AspectJ ，Advice 和 PointcutDefinition 结合在一起
 * 1、创建一个 Aspect 类
 * 2、配置 Spring 配置文件
 */
@Aspect
public class LoggingAspect {
    @Before("execution(public * com.guc.fristspring.aop.aspectj.CustomerBo.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("logBefore() is running ...");
        System.out.println("guc:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }


    //类中的具体方法 logBefore 和 logAfter 即为 Advice
    //Advice 方法上的表达式为 PointcutDefinition 表达式，即定义了切入点
    //execution ( * com.guc.fristspring.aop.aspectj.*.*(..)) 表示切入点是 com.shiyanlou.spring.aop.aspectj 包中的任意一个类的任意方法，具体的表达式请自行搜索。
    @After("execution(public * com.guc.fristspring.aop.aspectj.CustomerBo.deleteCustomer(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("logAfter() is running ...");
        System.out.println("guc:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }
}
