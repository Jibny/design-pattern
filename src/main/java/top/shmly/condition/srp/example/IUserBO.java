package top.shmly.condition.srp.example;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 21:16
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IUserBO {
    void setUserID(String userID);

    String getUserID();

    void setPassword(String password);

    String getPassword();

    void setUserName(String userName);

    String getUserName();
}
