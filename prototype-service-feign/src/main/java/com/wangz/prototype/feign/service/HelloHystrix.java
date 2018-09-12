package com.wangz.prototype.feign.service;

import org.springframework.stereotype.Component;

/**
 * @autor: wangzhuang
 * @Date: 2018/9/9
 */
@Component
public class HelloHystrix implements HelloService {
    @Override
    public String hello(String name) {
        return "sorry," + name + ",error";
    }
}
