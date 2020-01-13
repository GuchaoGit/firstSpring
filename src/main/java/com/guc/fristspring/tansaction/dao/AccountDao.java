package com.guc.fristspring.tansaction.dao;

import com.guc.fristspring.tansaction.entity.Account;

import java.util.List;

/**
 * 账户接口
 */
public interface AccountDao {
    /**
     * 汇款
     * @param outer 汇款人
     * @param money 汇款金额
     */
    void out(String outer,int money);

    /**
     * 收款
     * @param inner 收款人
     * @param money 收款金额
     */
    void in(String inner,int money);

    List<Account> queryAll();
}
