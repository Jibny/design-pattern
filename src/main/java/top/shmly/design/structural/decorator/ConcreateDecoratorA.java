package top.shmly.design.structural.decorator;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 19:48
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ConcreateDecoratorA extends Decorator{
    public ConcreateDecoratorA(Component _component) {
        super(_component);
    }

    public void methodA(){
        System.out.println("ready do something AAAAA。。。");
    }

    @Override
    public void operate() {
        this.methodA();
        super.operate();
    }
}
