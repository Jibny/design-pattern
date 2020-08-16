package top.shmly.design.structural.flyweight;

import javax.xml.transform.Source;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 1:39
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        // 1.获取一个生产InternalObject内部共享类的工厂
        FlyweightFactory<InternalObject> flyweightFactory = FlyweightFactory.getFlyweightFactory();
        // 2.将需要缓存的内部对象扔到pool去
        initFlyFactoryPool(flyweightFactory);
        // 3.定义一个临时Key内部共享对象变量，用于查找享元池获取共享对象
        InternalObject internalkey = InternalObject.builder().age(20).device("Windows").build();
        Flyweight<InternalObject, ExternalObject> flyweight = flyweightFactory.getFlyweight(internalkey);
        // 4.设置外部对象
        flyweight.setExternalState(ExternalObject.builder().id(10000L).userName("user").build());
        System.out.println(flyweight.toString());

        // 5.从享元工厂中获取A,B共享内部对象
        internalkey.setAge(101);
        internalkey.setDevice("IOS");
        Flyweight<InternalObject, ExternalObject> flyweightA = flyweightFactory.getFlyweight(internalkey);
        flyweightA.setExternalState(ExternalObject.builder().id(10001L).userName("zhansan").build());

        Flyweight<InternalObject, ExternalObject> flyweightB = flyweightFactory.getFlyweight(internalkey);
        flyweightB.setExternalState(ExternalObject.builder().id(10002L).userName("lisi").build());

        System.out.println("--比较A,B对象-----------");
        System.out.println(flyweightA.toString());
        System.out.println(flyweightB.toString());
        System.out.println("--flyweightA.equals(flyweightB): " + flyweightA.equals(flyweightB));
        System.out.println("--flyweightA.getInternalState().equals(flyweightB.getInternalState()): " + flyweightA.getInternalState().equals(flyweightB.getInternalState()));
        System.out.println("--flyweightA.getExternalState().equals(flyweightB.getExternalState()): " + flyweightA.getExternalState().equals(flyweightB.getExternalState()));
    }

    private static void initFlyFactoryPool(FlyweightFactory flyweightFactory) {
        String[] device = {"Windows", "Andriod", "IOS", "MacOS", "Linux"};
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 101; j++) {
                InternalObject internalObject = InternalObject.builder().age(j).device(device[i]).build();
                flyweightFactory.setPoolCache(internalObject);
            }
        }
        System.out.println("--initFlyweightPool--succeed--InternalObject(age=0-100, device=Windows,Andriod,IOS,MacOS,Linux)");
    }

}
