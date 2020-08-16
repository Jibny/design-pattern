package top.shmly.design.structural.adapter.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 18:44
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class UserInfoServiceImpl implements IUserInfoService{
    @Override
    public String getUserName() {
        System.out.println("人员姓名。。。");
        return null;
    }

    @Override
    public String getHomeAdress() {
        System.out.println("人员家庭住址。。。");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("人员手机号码。。。");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("人员工作电话。。。");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("人员工作地址。。。");
        return null;
    }
}
