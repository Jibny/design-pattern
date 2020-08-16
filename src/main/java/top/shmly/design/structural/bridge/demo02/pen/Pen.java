package top.shmly.design.structural.bridge.demo02.pen;

import top.shmly.design.structural.bridge.demo02.color.Color;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:33
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Pen {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);

    public Color getColor() {
        return this.color;
    }

}
