package springframework.support;

import springframework.BeansException;
import springframework.config.BeanDefinition;

/**
@author YWZ
@date 2023/6/4 - 21:30
*/public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        registerSingleton(name,bean);
        return bean;
    }
}
