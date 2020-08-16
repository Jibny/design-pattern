package top.shmly.design.structural.decorator;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 19:51
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ConcreateDecoratorB extends Decorator{
    public ConcreateDecoratorB(Component _component) {
        super(_component);
    }

    public void methodB(){
        System.out.println("ready do something BBBBB。。。");
    }

    @Override
    public void operate() {
        this.methodB();
        super.operate();
    }
}
