package com.zhu.demo.springboot.controller;

import com.zhu.demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/helloUser/{id}")
    public String selectUser (@PathVariable int id){
        return userService.selectUser(id)+"";

    }
}
