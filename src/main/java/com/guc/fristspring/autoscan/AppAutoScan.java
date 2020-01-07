package com.guc.fristspring.autoscan;

import com.guc.fristspring.autoscan.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author guc
 * @Date 2020/1/7 11:54
 * @Description Spring自动扫描与自动装配
 */
public class AppAutoScan {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringCustomer.xml");
        //Spring 将把组件 Class 的第一个字母变成小写，来作为自动扫描组件的名称
        CustomerService cust = (CustomerService) context.getBean("customerService");
        System.out.println(cust);
    }
}
