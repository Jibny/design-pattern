package top.shmly.design.structural.adapter.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 19:09
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        IUserInfoService userInfo = new OuterUserInfoAdapterService();
        userInfo.getUserName();
        userInfo.getMobileNumber();
        userInfo.getHomeAdress();
        userInfo.getOfficeTelNumber();
        userInfo.getJobPosition();
    }
}
// zhansan
// 18000001111
// xxx road No.33
// 18000001111
// work road No.66