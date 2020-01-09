package com.guc.fristspring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @Author guc
 * @Date 2020/1/8 13:55
 * @Description
 * After throwing advice - method 抛出异常后通知
 */
public class HiAfterThrowExceptionMethod implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("HiAfterThrowExceptionMethod : Throw exception guc!");
    }
}
