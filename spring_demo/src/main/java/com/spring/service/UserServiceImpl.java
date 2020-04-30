package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void changeUser(User user) {

    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
