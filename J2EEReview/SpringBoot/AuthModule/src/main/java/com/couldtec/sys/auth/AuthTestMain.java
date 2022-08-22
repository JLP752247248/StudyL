package com.couldtec.sys.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication//springboot启动注解
@EnableScheduling
@EnableEurekaClient//eureka注册配置，如果不配置则不注册到eureka中心
public class AuthTestMain{

    public static void main(String[] args) {
        SpringApplication.run(AuthTestMain.class, args);
    }
}
