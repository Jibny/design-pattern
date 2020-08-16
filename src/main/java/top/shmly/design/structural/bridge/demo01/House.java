package top.shmly.design.structural.bridge.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:03
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class House extends Product{
    @Override
    public void beProducted() {
        System.out.println("由Product-House生产出来的房子");
    }

    @Override
    public void beSelled() {
        System.out.println("由Product-House生产出来卖掉的房子");
    }

}
