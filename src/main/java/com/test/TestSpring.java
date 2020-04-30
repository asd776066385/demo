package com.test;

import com.config.AppConfig;
import com.service.OrderService;
import com.service.UserService;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        AbstractAutowireCapableBeanFactory abstractAutowireCapableBeanFactory = (AbstractAutowireCapableBeanFactory) annotationConfigApplicationContext.getAutowireCapableBeanFactory();
        abstractAutowireCapableBeanFactory.setAllowCircularReferences(false);
        annotationConfigApplicationContext.register(AppConfig.class);
        annotationConfigApplicationContext.refresh();
        String name = annotationConfigApplicationContext.getBean(UserService.class).getClass().getName();
        System.out.println(name);
    }
}
