package com.crispinlol.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.crispinlol.pojo.User;


@Service
public class UserServiceImpl implements IUserService{

    @Reference(check = false)
    IPayService iPayService;

    @Override
    public User queryUser() {
        User user1 = new User("tom",10);
        iPayService.pay();
        return user1;
    }

    @Override
    public void addUser(User user) {
        System.out.println("provider处理业务");
    }
}
