package top.shmly.condition.dip;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 20:23
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        IDriver zhansan = new Driver();
        ICar benz = new Benz();
        zhansan.drive(benz);

        ICar bmw = new Bmw();
        zhansan.drive(bmw);
    }
}
