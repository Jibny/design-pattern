package top.shmly.design.created.builder;

import lombok.Data;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 18:01
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("Benz车开始构建。。。");
    }

    @Override
    protected void stop() {
        System.out.println("Benz车停止构建。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz车构建喇叭。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz车构建引擎。。。");
    }
}
