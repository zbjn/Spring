package springframework.support;
import springframework.BeanFactory;
import springframework.BeansException;
import springframework.config.BeanDefinition;

/**
 * @author YWZ
 * @date 2023/6/4 - 20:59
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    protected abstract BeanDefinition getBeandefinition(String beanName) throws BeansException;

    public Object getBean(String name) throws BeansException {
        Object bean = super.getSingleton(name);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeandefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition) throws BeansException;

}
