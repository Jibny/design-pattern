package top.shmly.design.structural.adapter;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 18:22
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
//        Target target = new ConcreateTarget();
//        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
// ConcreateTarget,if you need any help,please call me!
// Adaptee,I‘m kind of busy，leave here.