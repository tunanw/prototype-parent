package com.wangz.prototype.feign.controller;

import com.wangz.prototype.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor: wangzhuang
 * @Date: 2018/9/7
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name){
        return helloService.hello(name);
    }
}
