package com.guc.fristspring.bean;

/**
 * @Author guc
 * @Date 2020/1/6 11:26
 * @Description 测试类
 */
public class Hello {
    private String name;

    public void setName(String n){
        this.name=n;
    }

    public void printHello(){
        System.out.println("The first Spring :hello"+name);
    }
}
