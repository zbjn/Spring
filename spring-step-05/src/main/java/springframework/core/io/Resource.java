package springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author YWZ
 * @date 2023/6/5 - 21:59
 */
public interface Resource {
    InputStream getInputStream() throws IOException;

}
