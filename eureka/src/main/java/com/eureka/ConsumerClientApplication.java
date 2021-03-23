package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: chensj
 * @Date: 2021/2/21 8:14 下午
 */
@SpringBootApplication
@EnableEurekaServer
public class ConsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class, args);
    }
}
