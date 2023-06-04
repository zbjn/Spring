package springframework.support;

import springframework.BeansException;
import springframework.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YWZ
 * @date 2023/6/4 - 21:55
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();
    @Override
    protected BeanDefinition getBeandefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition==null)
            throw new BeansException("NO bean Name" + beanName + "is Definition");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
