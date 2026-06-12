package com.b2b.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class B2bRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2bRegistryApplication.class, args);
    }
}
