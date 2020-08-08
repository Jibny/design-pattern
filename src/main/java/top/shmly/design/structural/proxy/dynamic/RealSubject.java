package top.shmly.design.structural.proxy.dynamic;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/9 0:35
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class RealSubject implements Subject {
    @Override
    public void doSomeThing(String status) {
        System.out.println("do something ----->" + status);
    }
}
