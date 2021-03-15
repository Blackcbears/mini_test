package com.example.mini.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuijing
 * @className ProviderController
 * @date 2021-03-12 02:24
 */

@RestController
@RequestMapping("/provider")
@Slf4j
public class ProviderController {

    @GetMapping("/helloProvider")
    public String helloProvider(){
        log.info("测试 helloProvider");
        return "你好,我是服务提供者";
    }
}