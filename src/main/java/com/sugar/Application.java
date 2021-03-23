package com.sugar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.LinkedList;

@MapperScan("com.sugar.mapper")
/**
 * 接口文档
 */
@EnableSwagger2
/**
 * 启动定时
 */
@EnableScheduling
/**
 * 启动缓存
 */
//@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
//@EnableCaching
public class Application implements ApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		System.out.println("启动工程了");
	}
}
