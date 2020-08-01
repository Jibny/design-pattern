package top.shmly.condition.lsp;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 17:31
 * @description: 士兵
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Soldier{
    AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("准备击杀敌人。。。");
        this.gun.shoot();
    }
}
