package springframework.config;

import springframework.BeansException;

/**
 * @author YWZ
 * @date 2023/6/4 - 19:59
 */
    public class BeanDefinition {
    private Class beanClass;
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
