package springframework.support;

import springframework.config.BeansException;
import springframework.core.io.Resource;
import springframework.core.io.ResourceLoader;

/**
 * @author YWZ
 * @date 2023/6/5 - 22:21
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinition(Resource resource) throws BeansException;
    void loadBeanDefinition(Resource... resource) throws BeansException;
    void loadBeanDefinition(String location) throws BeansException;

}
