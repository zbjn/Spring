package springframework.support;

import springframework.config.SingletonBeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YWZ
 * @date 2023/6/4 - 20:55
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanFactory {

    private Map<String, Object> singletonObjects = new HashMap<String, Object>();

    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
