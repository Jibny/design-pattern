package top.shmly.design.behavioral.strategy;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 14:51
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        IStrategy iStrategy = new StrategySub();
        Context context = new Context(iStrategy);
        System.out.println(context.calculate(10, 5));
    }
}
