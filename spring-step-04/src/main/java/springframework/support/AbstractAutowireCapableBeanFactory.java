package springframework.support;

import cn.hutool.core.bean.BeanUtil;
import springframework.PropertyValue;
import springframework.PropertyValues;
import springframework.config.BeanReference;
import springframework.config.BeansException;
import springframework.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author YWZ
 * @date 2023/6/4 - 21:30
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, name, args);
            applyPropertyValues(name,bean,beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed" + e);
        }
        registerSingleton(name, bean);
        return bean;
    }

    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {

        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue :propertyValues.getPropertyValues()) {

                String name = propertyValue.getName();
                Object value = propertyValue.getValue();
                if (value instanceof BeanReference){
                     BeanReference beanReference = (BeanReference) value;
                     value = getBean(beanReference.getBeanName());
                }

                BeanUtil.setFieldValue(bean,name,value);

            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values:" + beanName);
        }

    }

    private Object createBeanInstance(BeanDefinition beanDefinition, String name, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (args != null && ctor.getParameterTypes().length == args.length){
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition,name,constructorToUse,args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
