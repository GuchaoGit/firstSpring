package com.guc.fristspring.autoscan.service;

import com.guc.fristspring.autoscan.dao.CustomerDAO;

/**
 * @Author guc
 * @Date 2020/1/7 11:56
 * @Description service层属于springmvc的service业务层
 */
public class CustomerService {
    CustomerDAO customerDAO;

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public String toString() {
        return "CustomerService [customerDAO=" + customerDAO + "]";
    }
}
