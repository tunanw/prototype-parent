package com.wangz.prototype.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PrototypeEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeEurekaServerApplication.class, args);
    }
}
