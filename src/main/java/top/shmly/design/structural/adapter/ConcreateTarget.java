package top.shmly.design.structural.adapter;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 21:40
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreateTarget,if you need any help,please call me!");
    }
}
