package springframework;

/**
 * @author YWZ
 * @date 2023/6/4 - 21:02
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
