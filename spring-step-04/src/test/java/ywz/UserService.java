package ywz;
/**
 * @author YWZ
 * @date 2023/6/4 - 20:19
 */
public class UserService {

    private String uId;

    private UserDao userDao;

    public void queryUserInfo(){
        System.out.println("查询用户详细:" + userDao.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
