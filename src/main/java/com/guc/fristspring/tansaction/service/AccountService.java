package com.guc.fristspring.tansaction.service;

import com.guc.fristspring.tansaction.entity.Account;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/10 16:09
 * @Description 账户服务
 */
public interface AccountService {
    /**
     * 转账
     * @param outer 汇款人
     * @param inner 收款人
     * @param money 交易金额
     * @return 0:转账成功 -1：转账失败
     */
    public int transfer(String outer,String inner,int money);

    public List<Account> queryAll();
}
