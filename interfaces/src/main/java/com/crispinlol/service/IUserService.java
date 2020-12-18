package com.crispinlol.service;

import com.crispinlol.pojo.User;

public interface IUserService {
    User queryUser();
    void addUser(User user);
}
