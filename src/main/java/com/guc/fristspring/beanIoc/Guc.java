package com.guc.fristspring.beanIoc;

import org.springframework.stereotype.Component;

/**
 * @Author guc
 * @Date 2020/1/6 15:43
 * @Description 基于注解的配置
 * @Component:被 Spring 容器自动识别，自动生成 Bean 定义
 * @Controller:对应表现层的 Bean，也就是 Action 。
 * @Service:对应的是业务层 Bean 。
 * @Repository:对应数据访问层 Bean 。
 */
@Component("Guc")
public class Guc {
    public void print(){
        System.out.println("Hello, My name is Guc");
    }
}
