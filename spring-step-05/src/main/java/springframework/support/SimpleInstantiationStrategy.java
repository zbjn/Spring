package springframework.support;

import springframework.config.BeanDefinition;
import springframework.config.BeansException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author YWZ
 * @date 2023/6/4 - 23:07
 * JDK策略实例化入参构造
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName,
                              Constructor ctor, Object[] args) throws BeansException {
        Class aClass = beanDefinition.getBeanClass();
        try {
                if (ctor != null) {
                    return aClass.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
                } else {
                    return aClass.getDeclaredConstructor().newInstance();
                }
            } catch (InstantiationException |IllegalAccessException|InvocationTargetException| NoSuchMethodException e) {
                throw new BeansException("Failed to instantiate" + e);
            }
    }
}
