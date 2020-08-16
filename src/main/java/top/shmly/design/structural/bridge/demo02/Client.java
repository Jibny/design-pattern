package top.shmly.design.structural.bridge.demo02;

import top.shmly.design.structural.bridge.demo02.color.Blue;
import top.shmly.design.structural.bridge.demo02.color.Color;
import top.shmly.design.structural.bridge.demo02.pen.Pen;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:44
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Color color = (Color) XMLUtilPen.getBean("color");
        Pen pen = (Pen) XMLUtilPen.getBean("pen");
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
