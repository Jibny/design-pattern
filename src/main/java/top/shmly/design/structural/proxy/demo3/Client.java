package top.shmly.design.structural.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 23:42
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new ProxySubject(realSubject);
        ClassLoader clazz = realSubject.getClass().getClassLoader();
        Subject proxy = (Subject) Proxy.newProxyInstance(clazz, new Class[]{Subject.class}, handler);
        proxy.request("zhansan");
    }
}
