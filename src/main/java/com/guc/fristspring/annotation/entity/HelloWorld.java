package com.guc.fristspring.annotation.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Author guc
 * @Date 2020/1/8 9:37
 * @Description @Resource 注解
 */
public class HelloWorld {

    private String messageString;
    private String messageString2;

    @Resource(name="msg")  //根据id=‘msg’去查找参数
    public void setMessage(String message){
        this.messageString = message;
    }

    public void setMessage2(String message){
        this.messageString2 = message;
    }
    public void getMessage(){
        System.out.println(this.messageString + "\n" + this.messageString2);
    }

    @PostConstruct
    public void initPost(){
        System.out.println("@ init HelloWorld");
    }

    @PreDestroy
    public void destroyPre(){
        System.out.println("@ destroy HelloWorld");
    }
}
