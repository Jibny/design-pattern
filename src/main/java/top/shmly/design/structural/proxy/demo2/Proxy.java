package top.shmly.design.structural.proxy.demo2;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 21:44
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Proxy implements Subject {
    private Subject realSubject = null;

    Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        doBefore();
        realSubject.request();
        doAfter();
    }

    @Override
    public Subject getProxy() {
        return this;
    }

    private void doAfter() {
        System.out.println("end proxy...");
    }

    private void doBefore() {
        System.out.println("start proxy...");
    }

}
