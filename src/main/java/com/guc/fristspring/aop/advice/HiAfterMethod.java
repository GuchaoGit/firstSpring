package com.guc.fristspring.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author guc
 * @Date 2020/1/8 13:51
 * @Description
 * After returning advice - method 返回一个结果后通知
 */
public class HiAfterMethod implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("HiAfterMethod : after returning Guc!");
    }
}
