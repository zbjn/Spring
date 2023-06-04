package com.ywz.springframework;

/**
 * @author YWZ
 * @date 2023/6/4 - 19:59
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
