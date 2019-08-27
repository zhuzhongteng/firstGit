package com.zhu.demo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saveFieldAd")
    public String helloWorld(){
        return "当你看到这句话说明spring boot项目跑起来了，恭喜你！！";
    }
}
