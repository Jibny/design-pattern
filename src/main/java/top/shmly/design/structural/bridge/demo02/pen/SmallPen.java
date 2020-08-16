package top.shmly.design.structural.bridge.demo02.pen;

import top.shmly.design.structural.bridge.demo02.color.Color;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:36
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class SmallPen extends Pen {

    @Override
    public void draw(String name) {
        String penType = "small pen drawing";
        this.getColor().Bepaint(penType, name);
    }
}
