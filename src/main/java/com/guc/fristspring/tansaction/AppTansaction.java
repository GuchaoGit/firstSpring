package com.guc.fristspring.tansaction;

import com.guc.fristspring.tansaction.entity.Account;
import com.guc.fristspring.tansaction.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/10 15:45
 * @Description Spring 事务管理
 */
public class AppTansaction {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringTransaction.xml");
        AccountService service = context.getBean("accountService",AccountService.class);
        //Tom 转给 Marry 1000
//       int res =  service.transfer("Tom","Marry",1000);
//        System.out.println(res==0?"转账成功":"转账失败");

        List<Account> accounts = service.queryAll();
        System.out.println("所有账户");
        if (accounts!=null){
            for (Account a:accounts){
                System.out.println(a);
            }
        }
    }
}
