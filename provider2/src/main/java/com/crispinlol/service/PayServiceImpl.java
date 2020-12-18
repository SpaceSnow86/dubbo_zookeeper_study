package com.crispinlol.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class PayServiceImpl implements IPayService{
    @Override
    public void pay() {
        System.out.println("调用服务提供者的支付业务");
    }
}
