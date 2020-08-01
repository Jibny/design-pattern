package top.shmly.condition.dip;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 19:56
 * @description: Dependence Inversion Principle 依赖倒置原则：高层模块不应该依赖低层模块，抽象不应该依赖细节，细节应该依赖抽象
 * <p>Java中的抽象指接口和抽象类。模块间依赖通过抽象(接口抽象类)发生，实现类之间不发生依赖关系，即面向接口编程</p>
 * <p>通过引入抽象，实现模块之间的解耦，实际也是开闭原则的体现</p>
 * <p>在并行开发中，通过定义好各个模块之间的规范，使开发不依赖于具体实现，便于并行开发测试风控</p>
 * <p>依赖的三种写法，接口声明依赖，构造函数传递依赖对象，setter方法传递依赖对象</p>
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IDriver {
    void drive(ICar car);
}
