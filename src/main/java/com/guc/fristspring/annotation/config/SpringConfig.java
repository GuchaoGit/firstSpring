package com.guc.fristspring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author guc
 * @Date 2020/1/8 10:08
 * @Description 定义一个配置类
 * 用@Configuration 注解该类，等价于 XML 里的 beans，
 * 用@Bean 注解方法，等价于 XML 配置的 bean，方法名等于 bean Id
 */
@Configuration
public class SpringConfig {
    @Bean
    public Service service(){
        return new Service();
    }
    @Bean
    public Client client(){
        return new Client();
    }
}
