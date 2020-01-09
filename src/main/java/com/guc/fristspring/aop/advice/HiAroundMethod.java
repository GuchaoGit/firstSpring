package com.guc.fristspring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * @Author guc
 * @Date 2020/1/8 14:07
 * @Description
 * Around advice - 环绕通知，结合了before after throw
 */
public class HiAroundMethod implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method name : "
                + methodInvocation.getMethod().getName());
        System.out.println("Method arguments : "
                + Arrays.toString(methodInvocation.getArguments()));
        // 相当于  MethodBeforeAdvice
        System.out.println("HiAroundMethod : Before method !");
        try {
            // 调用原方法，即调用CustomerService中的方法
            Object result = methodInvocation.proceed();

            // 相当于 AfterReturningAdvice
            System.out.println("HiAroundMethod : After method !");

            return result;

        } catch (IllegalArgumentException e) {
            // 相当于 ThrowsAdvice
            System.out.println("HiAroundMethod : Throw exception !");
            throw e;
        }
    }
}
