package com.service;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public OrderService() {
        System.out.println("OrderService init");
    }

    public void test(){
        System.out.println("OrderService test");
    }
}
