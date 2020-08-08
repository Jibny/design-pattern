package top.shmly.design.structural.proxy.dynamic;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/9 0:43
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println(this.getClass().getName() + ":执行前置通知>>>>>");
    }
}
