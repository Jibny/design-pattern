package top.shmly.design.behavioral.template;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 15:08
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class SpaceTemplate extends AbstractTemplate {
    @Override
    protected int firstBehavior(String mesaage) {
        System.out.println("String length is " + mesaage.length());
        return mesaage.length();
    }

    @Override
    protected void secondBehavior(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append("消耗空间:").append(num * 2).append("字节");
        System.out.println(sb.toString());
    }

    @Override
    protected void finallyBehavior() {
        System.out.println("最后执行消耗结束-----");
    }
}
