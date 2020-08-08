package top.shmly.design.structural.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 23:37
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ProxySubject implements InvocationHandler {
    Class clazz = null;
    Object object = null;

    public ProxySubject(Object _object) {
        this.object = _object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);
        if (method.getName().equalsIgnoreCase("request")) {
            System.out.println("the thing being completed!");
        }
        return result;
    }
}
