package com.couldtec.webserver.apps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * springboot程序启动类
 * @author jlp
 *
 */
@SpringBootApplication//springboot启动注解
@EnableScheduling
@EnableEurekaClient//eureka注册配置，如果不配置则不注册到eureka中心
public class Application extends SpringBootServletInitializer {
	/** log */
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.warn("sprignboot程序启动,通过tomcat");
		return application.sources(Application.class);
    }
    public static void main(String[] args) {
    	logger.warn("sprignboot程序启动,通过main");
    	//PropertyConfigurator.configure(Application.class.getResource("/log4j.properties").getPath() );
		SpringApplication.run(Application.class, args);
    	//System.out.print(System.currentTimeMillis());
    }
}
