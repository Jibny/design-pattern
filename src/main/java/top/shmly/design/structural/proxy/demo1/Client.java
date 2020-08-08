package top.shmly.design.structural.proxy.demo1;



/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 21:47
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Subject proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
