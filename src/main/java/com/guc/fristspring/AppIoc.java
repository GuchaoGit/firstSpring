package com.guc.fristspring;

import com.guc.fristspring.beanIoc.AppConfig;
import com.guc.fristspring.beanIoc.Customer;
import com.guc.fristspring.beanIoc.FileNameGenerator;
import com.guc.fristspring.beanIoc.Guc;
import com.guc.fristspring.customer.services.CustomerServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author guc
 * @Date 2020/1/6 15:36
 * @Description Ioc测试
 */
public class AppIoc {
    private static ApplicationContext context;
    private static ApplicationContext contextAnnotator;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        contextAnnotator = new AnnotationConfigApplicationContext(Guc.class);

        FileNameGenerator fileNameGenerator = (FileNameGenerator) context.getBean("FileNameGenerator");
        fileNameGenerator.printFileName();

        Guc guc = (Guc) contextAnnotator.getBean("Guc");
        guc.print();

        Customer customer = (Customer) context.getBean("Customer");
        System.out.println(customer.toString());

        CustomerServices csa = (CustomerServices) context.getBean("CustomerServices");
        csa.setMessage("Message by CSA");
        System.out.println("Message : " + csa.getMessage());
        //再次获取  设置 scope 为 prototype 后，测试代码中，每调用一次 getBean() 方法后，都会得到一个新的实例
        CustomerServices csb = (CustomerServices) context.getBean("CustomerServices");
        System.out.println("Message : " + csb.getMessage());
    }
}
