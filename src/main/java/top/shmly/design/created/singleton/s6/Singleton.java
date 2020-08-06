package top.shmly.design.created.singleton.s6;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 22:53
 * @description: 枚举单例，还可以防止序列化
 * @Created By IntelliJ IDEA 2020.1.3
 */
public enum  Singleton {
    // 单例
    SingletonInstance;

    // 计数
    private int count = 0;
    private Singleton() {
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }
}
