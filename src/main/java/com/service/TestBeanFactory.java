package com.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactory implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("TestBeanFactory postProcessBeanFactory");
        GenericBeanDefinition orderService = (GenericBeanDefinition) configurableListableBeanFactory.getBeanDefinition("orderService");
        orderService.setBeanClass(UserService.class);
    }
}
