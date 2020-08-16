package top.shmly.design.structural.composite.transparent;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 19:59
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Component {
    // 个体整体具有的共享
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    // 增加一个叶子构件或者树枝构件
    public abstract void add(Component component);

    public abstract void remove(Component component);
    public abstract void display(int depth);
    public abstract ArrayList<Component> getChildren();
}
