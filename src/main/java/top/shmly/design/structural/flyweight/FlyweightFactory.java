package top.shmly.design.structural.flyweight;

import java.util.HashMap;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 1:23
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class FlyweightFactory<TI> {
    private HashMap<TI, TI> pool = new HashMap<>(512);

    private FlyweightFactory() {
    }

    public Flyweight getFlyweight(TI internalState) {
        Flyweight flyweight = null;
        if (!this.pool.containsKey(internalState)) {
            pool.put(internalState, internalState);
            System.out.println("FlyweightFactory添加内部对象缓存成功--" + internalState.toString());
        }
        flyweight = new ConcreateFlyweight(this.pool.get(internalState));
        System.out.println("FlyweightFactory获取内部对象缓存成功--" + internalState.toString());
        return flyweight;
    }

    public void setPoolCache(TI internalObject) {
        this.pool.put(internalObject, internalObject);
    }

    private static class FlyweightFactoryHolder {
        private static final FlyweightFactory flyweightFactory = new FlyweightFactory();
    }

    public static FlyweightFactory getFlyweightFactory() {
        return FlyweightFactoryHolder.flyweightFactory;
    }

}
