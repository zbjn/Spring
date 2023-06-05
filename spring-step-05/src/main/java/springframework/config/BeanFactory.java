package springframework.config;

/**
 * @author YWZ
 * @date 2023/6/4 - 21:02
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;

}
