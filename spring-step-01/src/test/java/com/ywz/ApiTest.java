package com.ywz;

import com.ywz.springframework.BeanDefinition;
import com.ywz.springframework.BeanFactory;
import org.junit.Test;

/**
 * @author YWZ
 * @date 2023/6/4 - 20:21
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        //初始化容器
        BeanFactory beanFactory = new BeanFactory();
        //注册bean对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //获取bean对象
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }


}
