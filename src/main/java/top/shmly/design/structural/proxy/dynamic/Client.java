package top.shmly.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/9 0:49
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomeThing("Finished");
    }
//    public static void main(String[] args) {
//        Subject subject = new RealSubject();
//        // 定义一个handler
//        InvocationHandler handler = new MyInvocationHandler(subject);
//        // 定义主题的代理
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
//        // 代理的行为
//        proxy.doSomeThing("Finish");
//    }
}
