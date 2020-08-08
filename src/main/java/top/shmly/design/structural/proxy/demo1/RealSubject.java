package top.shmly.design.structural.proxy.demo1;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 21:43
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("do something .......");
    }
}
