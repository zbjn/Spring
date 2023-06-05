package springframework.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import springframework.config.BeansException;
import springframework.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author YWZ
 * @date 2023/6/4 - 23:20
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName,
                              Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (ctor == null) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(),args);
    }
}
