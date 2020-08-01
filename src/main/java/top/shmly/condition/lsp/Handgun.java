package top.shmly.condition.lsp;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 17:28
 * @description: 手枪
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Handgun extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("手枪射击...");
    }
}
