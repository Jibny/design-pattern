package top.shmly.design.created.factory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 13:14
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种。。。");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话两个字节。。。");
    }
}
