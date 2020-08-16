package top.shmly.design.structural.bridge;


/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:37
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Abstraction {
    private Implementor implementor = null;

    public Abstraction(Implementor _implementor) {
        this.implementor = _implementor;
    }

    public void request(){
        implementor.doSomething();
    }

    public final Implementor getImplementor(){
        return this.implementor;
    }

}
