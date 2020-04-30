package com.service;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class UserService{
    public UserService() {
        System.out.println("UserService init");
    }
    public void say_hello(){
        System.out.println("UserService.say_hello");
    }
}
