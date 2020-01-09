package com.guc.fristspring.aop;

import com.guc.fristspring.aop.advice.Customer2Service;
import com.guc.fristspring.aop.advice.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author guc
 * @Date 2020/1/8 10:44
 * @Description 面向切面编程
 */
public class AppAop {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringAOPAdvice.xml");
        CustomerService service = context.getBean("customerService", CustomerService.class);
        System.out.println("*************************");
        service.printName();
        System.out.println("*************************");
        service.printEmail();
        System.out.println("*************************");
        try {
            service.printThrowException();
        } catch (Exception e) {
            System.out.println("抛出了异常");
        }
        System.out.println("*************************");
        System.out.println("*************************");
        Customer2Service service2 = context.getBean("customer2Service", Customer2Service.class);
        System.out.println("*************************");
        service.printName();
        System.out.println("*************************");
        service.printEmail();
        System.out.println("*************************");
        try {
            service.printThrowException();
        } catch (Exception e) {
            System.out.println("抛出了异常");
        }


    }
}
