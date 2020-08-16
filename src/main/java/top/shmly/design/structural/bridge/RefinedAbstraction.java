package top.shmly.design.structural.bridge;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:38
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor _implementor) {
        super(_implementor);
    }

    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
