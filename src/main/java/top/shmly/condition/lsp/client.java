package top.shmly.condition.lsp;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 17:36
 * @description: 模拟场景
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class client {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();

        soldier.setGun(new SniperRifle());
        soldier.killEnemy();
    }
}
