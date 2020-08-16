package top.shmly.design.structural.adapter;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 18:21
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
