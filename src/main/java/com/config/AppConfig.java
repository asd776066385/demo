package com.config;

import com.service.OrderService;
import com.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig init");
    }

//    @Bean
//    public UserService getUserService(){
//        return new UserService();
//    }

//    @Bean
//    public OrderService getOrderService(){
//        return new OrderService();
//    }

    
}
