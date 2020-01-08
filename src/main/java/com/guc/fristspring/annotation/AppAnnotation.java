package com.guc.fristspring.annotation;

import com.guc.fristspring.annotation.config.Client;
import com.guc.fristspring.annotation.config.SpringConfig;
import com.guc.fristspring.annotation.entity.Dog;
import com.guc.fristspring.annotation.entity.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author guc
 * @Date 2020/1/7 16:48
 * @Description 基于注解的配置
 */
public class AppAnnotation {
    private static AbstractApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringAnnotation.xml");
        Dog dog = context.getBean("dogBean",Dog.class);
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(dog);
        helloWorld.getMessage();
        context.registerShutdownHook();//销毁对象

        ApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfig.class);
        Client client = context2.getBean("client", Client.class);
        client.invokeService();
    }
}
