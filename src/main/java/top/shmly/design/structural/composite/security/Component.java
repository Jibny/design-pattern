package top.shmly.design.structural.composite.security;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 14:40
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //获取分支下的所有叶子构件和树枝构件
    public abstract void display(int depth);

}