package springframework.support;

import springframework.config.BeanDefinition;
import springframework.config.BeansException;

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
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName       Bean 名称
     * @param beanDefinition Bean 定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
