package springframework.config;

import springframework.HierarchicalBeanFactory;

/**
 * @author YWZ
 * @date 2023/6/5 - 23:19
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanFactory {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}
