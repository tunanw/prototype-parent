package com.wangz.prototype.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PrototypeConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeConfigServerApplication.class, args);
    }

}
