package top.shmly.design.structural.adapter.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 18:49
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class OuterUserServiceImpl implements IOuterUserService {
    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("username","zhansan");
        baseInfoMap.put("mobileNumber","18000001111");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> officeInfoMap = new HashMap<>();
        officeInfoMap.put("officeTelNumber","18000001111");
        officeInfoMap.put("jobPosition","work road No.66");
        return officeInfoMap;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put("homeAdress","xxx road No.33");
        return homeInfoMap;
    }
}
