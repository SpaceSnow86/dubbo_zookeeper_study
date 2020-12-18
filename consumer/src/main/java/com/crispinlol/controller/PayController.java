package com.crispinlol.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.crispinlol.service.IPayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Reference
    IPayService iPayService;

    @GetMapping("/test1")
    public void test1(){
        iPayService.pay();
    }
}
