package com.guc.fristspring.tansaction.dao;

import com.guc.fristspring.tansaction.entity.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/10 15:59
 * @Description 账户操作实现
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    /**
     * 根据用户名减少账户金额
     */
    @Override
    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set money = money - ? where username = ?",money,outer);
    }

    /**
     * 根据用户名增加账户金额
     */
    @Override
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set money = money + ? where username = ?",money,inner);
    }

    @Override
    public List<Account> queryAll() {
        return this.getJdbcTemplate().query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
    }
}
