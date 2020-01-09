package com.guc.fristspring.aop.aspectj;

/**
 * @Author guc
 * @Date 2020/1/9 9:51
 * @Description 接口
 */
public interface ICustomerBo {
    void addCustomer();
    void deleteCustomer();
    String addCustomerReturnValue();
    void addCustomerThrowException() throws Exception;
    void addCustomerAround(String name);
}
