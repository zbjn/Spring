package springframework.support;

import springframework.BeansException;
import springframework.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author YWZ
 * @date 2023/6/4 - 23:04
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args) throws BeansException;

}
