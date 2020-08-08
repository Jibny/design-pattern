package top.shmly.design.structural.proxy.demo2;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 21:32
 * @description: 强制代理
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface Subject {
    void request();
    Subject getProxy();
}
