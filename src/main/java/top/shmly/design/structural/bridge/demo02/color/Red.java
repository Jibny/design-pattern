package top.shmly.design.structural.bridge.demo02.color;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 22:41
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Red implements Color {
    @Override
    public void Bepaint(String penType, String name) {
        System.out.println(penType + " 红色的 " + name + ".");
    }
}
