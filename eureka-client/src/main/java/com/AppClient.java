package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

/**
 * @Description:
 * @Author: chengh
 * @Date: 2020/3/3 23:08
 */
@SpringBootApplication
@EnableEurekaClient
public class AppClient {
    public static void main(String[] args) {
        SpringApplication.run(AppClient.class);
    }
}
