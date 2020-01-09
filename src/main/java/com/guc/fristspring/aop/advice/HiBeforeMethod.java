package com.guc.fristspring.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author guc
 * @Date 2020/1/8 11:52
 * @Description Before advice - method 执行前通知
 */
public class HiBeforeMethod implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("HiBeforeMethod : Before method Guc!");
    }
}
