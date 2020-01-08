package com.guc.fristspring.annotation.entity;

import com.guc.fristspring.annotation.servcie.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author guc
 * @Date 2020/1/7 16:53
 * @Description 狗
 */
public class Dog {
    private Person person;
    private String name;
    @Autowired
    @Qualifier("hello2")  //一般在两个或者多个 bean 是相同的类型，spring 在注入的时候会出现混乱
    private Hello hello;

    public Person getPerson() {
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required  //必须被注入
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        hello.sayHello();
        return "Dog{" +
                "person=" + person +
                ", name='" + name + '\'' +
                '}' ;
    }
    @PostConstruct  //注解作为初始化回调
    public void initPost(){
        System.out.println("@ init Dog");
    }
    @PreDestroy //作为销毁回调的替代
    public void destroyPre(){
        System.out.println("@ destroy Dog");
    }

}
