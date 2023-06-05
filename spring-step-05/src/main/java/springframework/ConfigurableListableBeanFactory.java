package springframework;

import springframework.config.AutowireCapableBeanFactory;
import springframework.config.BeanDefinition;
import springframework.config.BeansException;
import springframework.config.ConfigurableBeanFactory;

/**
 * @author YWZ
 * @date 2023/6/5 - 23:21
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
