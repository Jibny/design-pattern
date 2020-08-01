package top.shmly.condition.lsp;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 17:29
 * @description: 步枪
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class SniperRifle extends AbstractGun {

    @Override
    public void shoot() {
        snipe();
        System.out.println("狙击枪射击...");
    }

    public void snipe() {
        System.out.println("狙击瞄准...");
    }
}
