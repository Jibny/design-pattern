package top.shmly.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/9 0:37
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader clazz, Class<?>[] interfaces, InvocationHandler h) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            (new BeforeAdvice()).exec();
        }
        // 执行目标并返回结果
        return (T) Proxy.newProxyInstance(clazz, interfaces, h);
    }
}
