package com.guc.fristspring;

import com.guc.fristspring.collections.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author guc
 * @Date 2020/1/6 17:05
 * @Description 集合类型测试
 */
public class AppCollections {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringCollections.xml");
        /*
         * case 1 : List 第1种情况
         */
        Customer customer = (Customer) context.getBean("customerBean");
        System.out.println(customer.getLists().toString());
        /*
         * case 2 : Set 第2种情况
         */
        System.out.println(customer.getSets().toString());
        /*
         * case 3 : Map 第3种情况
         */
        System.out.println(customer.getMaps().toString());

        /*
         * case 4 : 第4种情况
         */
        System.out.println(customer.getPros().toString());
    }
}
