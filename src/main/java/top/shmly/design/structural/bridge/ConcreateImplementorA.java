package top.shmly.design.structural.bridge;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:38
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ConcreateImplementorA implements Implementor{
    @Override
    public void doSomething() {
        System.out.println("do something AAA");
    }

    @Override
    public void doAnything() {
        System.out.println("do anything AAA");
    }
}
