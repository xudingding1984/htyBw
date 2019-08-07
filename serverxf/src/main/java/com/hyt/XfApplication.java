package com.hyt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.hyt.mapper.*"})
public class XfApplication {

    public static void main(String[] args) {
        SpringApplication.run(XfApplication.class, args);
    }
}

