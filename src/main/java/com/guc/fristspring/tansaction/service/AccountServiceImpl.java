package com.guc.fristspring.tansaction.service;

import com.guc.fristspring.tansaction.dao.AccountDao;
import com.guc.fristspring.tansaction.entity.Account;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/10 16:10
 * @Description 转账业务
 */
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    @Override
    public int transfer(String outer, String inner, int money) {

        try {
            transactionTemplate.execute(new TransactionCallbackWithoutResult() {
                @Override
                protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                    accountDao.out(outer,money);
    //                int i = 1/0;  // 模拟操作出错
                    accountDao.in(inner,money);
                }
            });
        } catch (TransactionException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    @Override
    public List<Account> queryAll() {
        return accountDao.queryAll();
    }

}
