package com.guc.fristspring.autoscan.service;

import com.guc.fristspring.autoscan.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author guc
 * @Date 2020/1/7 11:56
 * @Description service层属于springmvc的service业务层
 */
@Service
public class CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public String toString() {
        return "CustomerService [customerDAO=" + customerDAO + "]";
    }
}
