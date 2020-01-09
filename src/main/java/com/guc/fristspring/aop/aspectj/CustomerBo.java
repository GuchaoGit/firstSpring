package com.guc.fristspring.aop.aspectj;

/**
 * @Author guc
 * @Date 2020/1/9 9:54
 * @Description AspectJ 实现 Spring AOP
 */
public class CustomerBo implements ICustomerBo{

    @Override
    public void addCustomer() {
        System.out.println("addCustomer() is running ...");
    }

    @Override
    public void deleteCustomer() {
        System.out.println("deleteCustomer() is running ...");
    }

    @Override
    public String addCustomerReturnValue() {
        System.out.println("addCustomerReturnValue() is running ...");
        return "guc";
    }

    @Override
    public void addCustomerThrowException() throws Exception {
        System.out.println("addCustomerThrowException() is running ...");
        throw new Exception("Generic Error");
    }

    @Override
    public void addCustomerAround(String name) {
        System.out.println("addCustomerAround() is running ...,args:"+name);
    }
}
