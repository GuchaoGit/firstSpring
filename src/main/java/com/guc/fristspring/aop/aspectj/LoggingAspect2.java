package com.guc.fristspring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author guc
 * @Date 2020/1/9 10:22
 * @Description 创建 Advice
 */
@Aspect
public class LoggingAspect2 {
    @Before("com.guc.fristspring.aop.aspectj.PointcutDefinition.customerLog()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("logBefore2() is running ...");
        System.out.println("guc2:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }


    //通过签名找到 PointcutsDefinition 中 customerLog 签名上的 Pointcut 表达式
    @After("com.guc.fristspring.aop.aspectj.PointcutDefinition.customerLog()")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("logAfter2() is running ...");
        System.out.println("gu2c:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }
}
