package top.shmly.design.structural.bridge.demo02.pen;

import top.shmly.design.structural.bridge.demo02.color.Color;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:40
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "middle pen drawing";
        this.getColor().Bepaint(penType, name);
    }
}
