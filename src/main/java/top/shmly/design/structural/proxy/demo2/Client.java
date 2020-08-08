package top.shmly.design.structural.proxy.demo2;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 22:35
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------访问代理类---------");
        Subject proxy = new Proxy(new RealSubject());
        proxy.request();
        System.out.println("---------直接访问真实类---------");
        Subject realSubject = new RealSubject();
        realSubject.request();
        System.out.println("---------通过真实对象访问代理类---------");
        Subject real = new RealSubject();
        Subject pro = real.getProxy();
        pro.request();
    }
}
