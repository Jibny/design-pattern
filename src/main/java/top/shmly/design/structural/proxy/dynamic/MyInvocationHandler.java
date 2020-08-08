package top.shmly.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/9 0:46
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;

    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
