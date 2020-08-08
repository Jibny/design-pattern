package top.shmly.design.created.builder;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 18:14
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 3 ; i++) {
            System.out.println("------A类Benz-------------");
            director.getABenzModel().run();
            System.out.println("------B类Benz-------------");
            director.getBBenzModel().run();
            System.out.println("------A类Bmw--------------");
            director.getABmwModel().run();
            System.out.println("------B类Bmw--------------");
            director.getBBmwModel().run();
        }
    }
}
// ------A类Benz-------------
// Benz车开始构建。。。
// Benz车构建喇叭。。。
// Benz车停止构建。。。
// ------B类Benz-------------
// Benz车开始构建。。。
// Benz车构建喇叭。。。
// Benz车构建引擎。。。
// Benz车停止构建。。。
// ------A类Bmw--------------
// Bmw车开始构建。。。
// Bmw车构建引擎。。。
// Bmw车构建喇叭。。。
// ------B类Bmw--------------
// Bmw车开始构建。。。
// Bmw车构建喇叭。。。
// Bmw车构建引擎。。。