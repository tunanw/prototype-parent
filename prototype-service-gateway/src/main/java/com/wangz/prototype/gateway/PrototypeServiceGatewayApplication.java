package com.wangz.prototype.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class PrototypeServiceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeServiceGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("route1", p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("hello", "world"))
                        .uri("http://httpbin.org"))
                .route("route2", p -> p
                        .host("*.aaa.com")
                        .filters(f -> f.hystrix(config -> config.setName("fallback").setFallbackUri("forward:/fallback")))
                        .uri("http://httpbin.org"))
                .build();
    }

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

}
