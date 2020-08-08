package top.shmly.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/9 1:13
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader clazz = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(clazz, classes, handler);
    }
}
