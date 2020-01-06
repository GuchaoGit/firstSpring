package com.guc.fristspring;

import com.guc.fristspring.bean.Hello;
import com.guc.fristspring.beanIoc.Person;
import com.guc.fristspring.loosely_coupled.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringBeans.xml","Spring-Output.xml");
        Hello hello = (Hello) context.getBean("helloBean");
        hello.printHello();

        Person person = (Person) context.getBean("personBean");
        System.out.println(person.toString());
        OutputHelper helper = (OutputHelper) context.getBean("OutputHelper");
        helper.generateOutput();
    }
}
