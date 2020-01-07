package com.guc.fristspring.autoscan.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author guc
 * @Date 2020/1/7 11:55
 * @Description dao持久层，DB操作都写在这里。
 */
@Repository  //用注释 @Component 来表示这个 Class 是一个自动扫描组件
public class CustomerDAO {
    @Override
    public String toString() {
        return  "Hello , This is CustomerDAO";
    }
}
