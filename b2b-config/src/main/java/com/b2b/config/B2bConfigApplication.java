package com.b2b.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class B2bConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2bConfigApplication.class, args);
    }
}
