package com.guc.fristspring.aop.advice;

/**
 * @Author guc
 * @Date 2020/1/8 11:21
 * @Description 通知
 */
public class CustomerService {
    private String name;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printName() {
        System.out.println("Customer name : " + this.name);
    }

    public void printEmail() {
        System.out.println("Customer website : " + this.email);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }

}
