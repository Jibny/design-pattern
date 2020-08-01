package top.shmly.design.created.factory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 13:08
 * @description: 工厂模式
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class AbstractFactory {
    abstract <T extends Human> T creatHuman(Class<T> c);
}
