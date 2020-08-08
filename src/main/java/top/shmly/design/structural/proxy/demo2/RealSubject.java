package top.shmly.design.structural.proxy.demo2;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 21:43
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class RealSubject implements Subject {
    private Subject proxy = null;

    @Override
    public void request() {
        if (this.isProxy()) {
            System.out.println("do something .......");
        } else {
            System.out.println("can't access not proxy class .......");
        }
    }

    @Override
    public Subject getProxy() {
        if (!this.isProxy()) {
            this.proxy = new Proxy(this);
        }
        return this.proxy;
    }

    private boolean isProxy() {
        return this.proxy != null;
    }

}
