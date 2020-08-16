package top.shmly.design.structural.bridge;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:45
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreateImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
