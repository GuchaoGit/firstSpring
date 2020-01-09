package com.guc.fristspring.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author guc
 * @Date 2020/1/9 10:17
 * @Description 创建 PointcutDefinition
 * 1、类声明前加入 @Aspect 注释
 * 2、@Pointcut 是切入点声明，指定需要注入的代码的位置
 * 3、方法 customerLog 是一个签名，在 Advice 中可以用此签名代替切入点表达式
 */
@Aspect
public class PointcutDefinition {
    @Pointcut("execution(public * com.guc.fristspring.aop.aspectj.CustomerBo.addCustomerReturnValue(..))")
    public void customerLog(){

    }
}
