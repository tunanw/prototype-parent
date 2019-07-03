package com.wangz.prototype.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @autor: wangzhuang
 * @Date: 2018/9/7
 */
@FeignClient(value = "eureka-client",fallback = HelloHystrix.class)
public interface HelloService {

    @GetMapping("hello")
    String hello(@RequestParam(value = "name")String name);

}
