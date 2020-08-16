package top.shmly.design.structural.decorator;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 19:57
 * @description: 装饰器模式：动态的给对象添加一些额外的职责，就增加功能来说，装饰模式相比生成子类更加灵活
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Decorator extends Component {
    Component component = null;

    public Decorator(Component _component){
        this.component = _component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
