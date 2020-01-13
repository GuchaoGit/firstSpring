package com.guc.fristspring.tansaction;

import com.guc.fristspring.tansaction.entity.Account;
import com.guc.fristspring.tansaction.entity.Website;
import com.guc.fristspring.tansaction.service.AccountService;
import com.guc.fristspring.tansaction.service.WebsiteServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/13 15:45
 * @Description Spring 事务管理 申明式
 */
public class AppTansaction2 {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringTransaction2.xml");
        WebsiteServiceImpl service = context.getBean("websiteService", WebsiteServiceImpl.class);

        List<Website> websites = service.queryAll();
        System.out.println("所有网站");
        if (websites!=null){
            for (Website a:websites){
                System.out.println(a);
            }
        }
    }
}
