package top.shmly.design.behavioral.strategy;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 14:46
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class StrategyAdd implements IStrategy {
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}
