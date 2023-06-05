package ywz;

import org.junit.Test;
import springframework.PropertyValue;
import springframework.PropertyValues;
import springframework.config.BeanDefinition;
import springframework.config.BeanReference;
import springframework.support.DefaultListableBeanFactory;

/**
 * @author YWZ
 * @date 2023/6/4 - 22:11
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //初始化容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册 UserDao
        beanFactory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));
        //3.使用UserService 填充属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId","10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
        //4.使用UserService注册bean对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class,propertyValues);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        //5.使用UserService获取Bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
