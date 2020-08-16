package top.shmly.design.behavioral.template;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 14:54
 * @description: 模板模式：定义一个操作中的算法框架，而将一些步骤延迟到子类中，
 * 使子类可以不改变一个算法的结构可重新定义该算法的某些步骤
 * <p></p>
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class AbstractTemplate {
    protected abstract int firstBehavior(String mesaage);

    protected abstract void secondBehavior(int num);

    protected abstract void finallyBehavior();

    public final void templateOrder(String str) {
        System.out.println("first--->");
        int result = firstBehavior(str);
        System.out.println("second--->");
        secondBehavior(result);
        System.out.println("finally--->");
        finallyBehavior();
    }
}
