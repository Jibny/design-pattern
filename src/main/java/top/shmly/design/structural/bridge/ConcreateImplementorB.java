package top.shmly.design.structural.bridge;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:41
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ConcreateImplementorB implements Implementor{

    @Override
    public void doSomething() {
        System.out.println("do something BBB");
    }

    @Override
    public void doAnything() {
        System.out.println("do anything BBB");
    }
}
