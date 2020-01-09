package com.guc.fristspring.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author guc
 * @Date 2020/1/9 10:09
 * @Description AspectJ 测试
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "SpringAOPAspectj.xml" });
        ICustomerBo customer = appContext.getBean("customerBo",ICustomerBo.class);
        customer.addCustomer();
        System.out.println("-------------------------------------------");
        customer.deleteCustomer();
        System.out.println("-------------------------------------------");
        String re = customer.addCustomerReturnValue();
        System.out.println(re);
    }
}
