package springframework.core.io;

/**
 * @author YWZ
 * @date 2023/6/5 - 22:12
 */
public interface ResourceLoader {
    String CLASS_URL_PREFIX = "classpath:";
    Resource getResource(String location);
}
