package top.shmly.design.structural.facade;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 17:07
 * @description: 门面之提供访问子系统的入口，不参与业务逻辑，因此可以用封装类，封装子系统逻辑提供入口给门面类
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Context {
    private SubClassA subClassA =new SubClassA();
    private SubClassB subClassB =new SubClassB();
    public void complexMethod(){
        subClassA.doSomethingA();
        subClassB.doSomethingB();
    }
}
