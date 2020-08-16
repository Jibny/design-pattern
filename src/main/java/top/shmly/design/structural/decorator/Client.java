package top.shmly.design.structural.decorator;


/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 19:52
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        component.operate();
        System.out.println("-----------------------------");
        component = new ConcreateDecoratorA(component);
        component.operate();
        System.out.println("-----------------------------");
        component = new ConcreateDecoratorB(component);
        component.operate();
        System.out.println("-----------------------------");
        component = new ConcreateDecoratorA(component);
        component.operate();
    }
}
// concreate do something
// -----------------------------
// ready do something AAAAA。。。
// concreate do something
// -----------------------------
// ready do something BBBBB。。。
// ready do something AAAAA。。。
// concreate do something
// -----------------------------
// ready do something AAAAA。。。
// ready do something BBBBB。。。
// ready do something AAAAA。。。
// concreate do something