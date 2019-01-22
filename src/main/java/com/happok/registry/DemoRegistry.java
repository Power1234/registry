package com.happok.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName DemoRegistry
 * @Description eureka注册中心
 * @Author Administrator
 * @Date 2019/1/22 0022 下午 17:12
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer //启动eureka注册中心
public class DemoRegistry {

    public static void main(String[] args) {
        SpringApplication.run(DemoRegistry.class, args);
    }
}
