package com.ywz.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author YWZ
 * @date 2023/6/4 - 20:00
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }

}
