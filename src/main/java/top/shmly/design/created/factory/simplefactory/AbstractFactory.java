package top.shmly.design.created.factory.simplefactory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 17:28
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class AbstractFactory {
    public abstract <T extends MoveTool> T create(Class<T> T);
}
