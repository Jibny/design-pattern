package top.shmly.design.structural.adapter.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 18:59
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class OuterUserInfoAdapterService extends OuterUserServiceImpl implements IUserInfoService {
    private Map<String, String> baseInfoMap = super.getUserBaseInfo();
    private Map<String, String> homeInfoMap = super.getUserHomeInfo();
    private Map<String, String> officeInfoMap = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String username = baseInfoMap.get("username");
        System.out.println(username);
        return username;
    }

    @Override
    public String getHomeAdress() {
        String homeAdress = homeInfoMap.get("homeAdress");
        System.out.println(homeAdress);
        return homeAdress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = baseInfoMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = officeInfoMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = officeInfoMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }
}
