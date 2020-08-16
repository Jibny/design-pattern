package top.shmly.design.structural.facade;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 17:01
 * @description: 门面模式：要求一个子系统的外部与其内部通信必须通过一个统一的对象进行
 * <p>优点：减少系统之间的依赖，通过门面对象进行解耦
 * 忽略子系统内部的变化只要不影响门面调用，提高安全性
 * 缺点：不符合开闭原则。系统修改扩展需要更改facede类
 * 应用场景：为复杂模块或子系统提供供外部访问的接口
 * 子系统相对独立，外界对子系统访问只需要黑箱操作，预防风险扩散
 * </p>
 *
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Facede {
    private SubClassA subClassA =new SubClassA();
    private SubClassB subClassB =new SubClassB();
    private SubClassC subClassC =new SubClassC();

    public void methodA(){
        subClassA.doSomethingA();
    }

    public void methodB(){
        subClassB.doSomethingB();
    }
    public void methodC(){
        subClassC.doSomethingC();
    }
}
