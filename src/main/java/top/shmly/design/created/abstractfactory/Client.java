package top.shmly.design.created.abstractfactory;



/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 15:53
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        factory = new ModernFactory();

        factory.createMoveTool().run();
        factory.createWeapon().shoot();
        factory.creatFood().eat();
//        car is running.....
//        Ak47 tututu。。。
//        eat bread。。。

        factory = new AncientFactory();
        factory.createMoveTool().run();
        factory.createWeapon().shoot();
        factory.creatFood().eat();
//        马车 biubiubiu。。。
//        刀剑 shuashuashua。。。
//        干粮 eeeeee。。。
    }
}
