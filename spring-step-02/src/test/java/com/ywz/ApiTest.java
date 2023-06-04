package com.ywz;

import org.junit.Test;
import springframework.config.BeanDefinition;
import springframework.support.DefaultListableBeanFactory;

/**
 * @author YWZ
 * @date 2023/6/4 - 22:11
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //初始化容器
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //注册Bean对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        defaultListableBeanFactory.registerBeanDefinition("userService",beanDefinition);
        //获取bean对象
        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
