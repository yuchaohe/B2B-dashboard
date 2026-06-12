package com.b2b.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class B2bGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2bGatewayApplication.class, args);
    }
}
