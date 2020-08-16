package top.shmly.design.structural.facade;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 17:05
 * @description: 新增门面引用其他门面
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Facade2 {
    private Facede facede = new Facede();
    private Context context = new Context();

    public void methodB() {
        this.facede.methodB();
    }
    public void methodAB(){
        this.context.complexMethod();
    }
}
