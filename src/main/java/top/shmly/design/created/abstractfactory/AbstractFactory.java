package top.shmly.design.created.abstractfactory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 18:58
 * @description: 抽象工厂
 * <p>抽象工厂模式是为了让创建工厂和一组产品与使用相分离，并可以随时切换到另一个工厂以及另一组产品；抽象工厂模式实现的关键点是
 * 定义工厂接口和产品接口，但如何实现工厂与产品本身需要留给具体的子类实现，客户端只和抽象工厂与抽象产品打交道</p>
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class AbstractFactory {
    abstract Food creatFood();
    abstract MoveTool createMoveTool();
    abstract Weapon createWeapon();
}
