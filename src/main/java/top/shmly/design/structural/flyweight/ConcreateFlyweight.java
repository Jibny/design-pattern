package top.shmly.design.structural.flyweight;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 1:17
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ConcreateFlyweight<TI,TO> extends Flyweight<TI,TO> {
    public ConcreateFlyweight(TI _internalState) {
        super(_internalState);
    }

    @Override
    public void operation() {
        System.out.println("do something。。。");
    }

}
