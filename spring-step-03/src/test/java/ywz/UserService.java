package ywz;
/**
 * @author YWZ
 * @date 2023/6/4 - 20:19
 */
public class UserService {
    public void queryUserInfo(){
        System.out.println("查询用户信息" + name);
    }

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
