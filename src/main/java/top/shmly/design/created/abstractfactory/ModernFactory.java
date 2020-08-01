package top.shmly.design.created.abstractfactory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 19:11
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food creatFood() {
        return new Bread();
    }

    @Override
    MoveTool createMoveTool() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

}
