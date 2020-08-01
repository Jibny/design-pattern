package top.shmly.design.created.factory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 13:13
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种。。。");
    }

    @Override
    public void talk() {
        System.out.println("白人说话一般单字节。。。");
    }
}
