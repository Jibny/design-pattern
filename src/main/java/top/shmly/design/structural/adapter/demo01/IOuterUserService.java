package top.shmly.design.structural.adapter.demo01;

import java.util.Map;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 18:47
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IOuterUserService {
    Map<String, String> getUserBaseInfo();

    Map<String, String> getUserOfficeInfo();

    Map<String, String> getUserHomeInfo();
}
