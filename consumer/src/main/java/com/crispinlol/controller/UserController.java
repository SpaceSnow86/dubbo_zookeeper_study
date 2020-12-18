package com.crispinlol.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.crispinlol.pojo.User;
import com.crispinlol.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    IUserService iUserService;

    @GetMapping("/query")
    public String queryUser(){
        User user = iUserService.queryUser();
        return user.toString();
    }

    @GetMapping("/add")
    public void addUser(){
        iUserService.addUser(new User("tom",1));
        System.out.println("consumer调用方法");
    }
}
