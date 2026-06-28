package com.b2b.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class B2bOrderServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(B2bOrderServiceApplication.class, args);
    }
}
