package top.shmly.design.created.builder;

import lombok.Data;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 18:02
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class BmwModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("Bmw车开始构建。。。");
    }

    @Override
    protected void stop() {
        System.out.println("Bmw车停止构建。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("Bmw车构建喇叭。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Bmw车构建引擎。。。");
    }
}
