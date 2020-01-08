package com.guc.fristspring.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author guc
 * @Date 2020/1/8 10:08
 * @Description Client
 */
public class Client {
    public String  sayHello(){
        return "Hello Client";
    }

    @Autowired
    Service service;
    public void invokeService(){
        System.out.println("client invoke :" + service.sayHello());
    }
}
