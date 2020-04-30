package com.spring.service;

import com.spring.vo.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void changeUser(User user);

    List<User> findAll();
}
