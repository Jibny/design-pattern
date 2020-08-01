package top.shmly.condition.lsp;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 16:55
 * @description: Liskov Substitution Principle 里氏替换原则：所有引用基类的地方必须能透明的使用其子类的对象
 * <p>继承带来扩展和复用的优点同时也降低了灵活性，增强了耦合。通过LSP原则发挥继承的优势，减少继承的弊端</p>
 * <p>1、子类必须完全实现父类的方法</p>
 * <p>2、子类可以有自己的个性（增加自己特有的方法）</p>
 * <p>3、重载，覆盖或实现父类方法时，输入参数可以被放大（父类传入参数HashMap，子类传入Map）</p>
 * <p>4、重写，覆盖或实现父类方法时，输出结果可以被缩小（父类返回结果Number，子类返回Integer）</p>
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class AbstractGun {
    /**
     * 定义抽象的枪，射击杀戮！
     */
    public abstract void shoot();
}
