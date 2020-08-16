package top.shmly.design.behavioral.strategy;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 14:48
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Context {
    IStrategy iStrategy = null;

    public Context(IStrategy _iStrategy) {
        this.iStrategy = _iStrategy;
    }

    public int calculate(int a, int b) {
       return iStrategy.operation(a, b);
    }
}
