package com.couldtec.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppMain {
    public static void main(String[] args) {SpringApplication.run(EurekaServerAppMain.class, args);

    }
}
