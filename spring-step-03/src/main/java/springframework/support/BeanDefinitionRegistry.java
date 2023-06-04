package springframework.support;

import springframework.config.BeanDefinition;

/**
 * @author YWZ
 * @date 2023/6/4 - 22:00
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName       Bean 名称
     * @param beanDefinition Bean 定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
