package springframework.config;

/**
 * @author YWZ
 * @date 2023/6/5 - 20:32
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
