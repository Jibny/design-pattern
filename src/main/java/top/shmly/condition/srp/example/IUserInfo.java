package top.shmly.condition.srp.example;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 21:10
 * @description: 职责不明确，可以进行接口职责拆分,IUserBO负责用户属性，IUserBiz负责用户行为，利用接口多继承和委托(策略、代理等)分离接口
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IUserInfo extends IUserBO,IUserBiz{

    void setUserID(String userID);

    String getUserID();

    void setPassword(String password);

    String getPassword();

    void setUserName(String userName);

    String getUserName();

    boolean deleteUser();

    void mapUser();

    boolean addOrg(int orgID);

    boolean addRole(int roleID);
}
