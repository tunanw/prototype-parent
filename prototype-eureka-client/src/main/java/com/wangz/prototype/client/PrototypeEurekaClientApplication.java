package com.wangz.prototype.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrototypeEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeEurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "wangzhuang") String name) {
        return "hi " + name + ",this service is from port " + port;
    }
}
