package com.guc.fristspring;

import com.guc.fristspring.bean.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Hello hello = (Hello) context.getBean("helloBean");
        hello.printHello();
    }
}
