package com.spring;

import com.spring.config.AppConfig;
import com.spring.service.UserService;
import com.spring.vo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//       DefaultListableBeanFactory defaultListableBeanFactory = context.getDefaultListableBeanFactory();
        UserService service = context.getBean(UserService.class);
        service.addUser(new User("asd","男"));
        System.out.println(service.findAll().toString());

    }
}
