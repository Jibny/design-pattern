package top.shmly.design.structural.bridge.demo02.color;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:43
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Blue implements Color {
    @Override
    public void Bepaint(String penType, String name) {
        System.out.println(penType + " 蓝色的 " + name + ".");
    }
}
