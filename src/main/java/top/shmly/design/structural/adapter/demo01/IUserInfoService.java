package top.shmly.design.structural.adapter.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 18:39
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IUserInfoService {
    // 获取人员姓名
    String getUserName();

    // 获取家庭住址
    String getHomeAdress();

    // 获取手机号码
    String getMobileNumber();

    // 获取工作电话号码
    String getOfficeTelNumber();

    // 获取工作地址
    String getJobPosition();
}
