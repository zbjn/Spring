package springframework.config;

/**
 * @author YWZ
 * @date 2023/6/4 - 20:49
 */
public interface SingletonBeanFactory {
    Object getSingleton(String beanName);
    void registerSingleton(String beanName,Object singletonObject);

}
