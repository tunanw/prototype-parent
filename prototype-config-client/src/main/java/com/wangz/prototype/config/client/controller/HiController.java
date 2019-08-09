package com.wangz.prototype.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhuang
 * @date 2019/8/5
 */
@RestController
@RequestMapping("hi")
@RefreshScope
public class HiController {

    @Value("${msg}")
    private String msg;

    @GetMapping("getMsg")
    public String hi() {
        return msg;
    }
}
