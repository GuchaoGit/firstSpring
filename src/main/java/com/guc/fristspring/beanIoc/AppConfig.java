package com.guc.fristspring.beanIoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author guc
 * @Date 2020/1/6 15:54
 * @Description 使用了 @Configuration+@Bean 注解
 */
@Configuration
public class AppConfig {
    @Bean(name="Guc")
    public Guc getGuc(){
        return new Guc();
    }
}
