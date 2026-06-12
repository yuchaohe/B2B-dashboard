package com.b2b.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class B2bUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2bUserServiceApplication.class, args);
    }
}
