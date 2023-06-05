package ywz;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YWZ
 * @date 2023/6/5 - 21:09
 */
public class UserDao {
    private static Map<String,String> hashmap = new HashMap<>();

    static {
        hashmap.put("10001","y");
        hashmap.put("10002","w");
        hashmap.put("10003","z");
    }

    public String queryUserName(String uId){
        return hashmap.get(uId);
    }
}
