package top.shmly.condition.srp.example;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 21:18
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IUserBiz {
    boolean deleteUser();

    void mapUser();

    boolean addOrg(int orgID);

    boolean addRole(int roleID);
}
