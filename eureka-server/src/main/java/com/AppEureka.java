package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: chengh
 * @Date: 2020/3/3 22:56
 */
@EnableEurekaServer
@SpringBootApplication
public class AppEureka {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class);
    }
}
