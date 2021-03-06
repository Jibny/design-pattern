package top.shmly.design.structural.composite.security;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 14:41
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    //构建容器
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    //增加一个叶子构件或树枝构件
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    //删除一个叶子构件或树枝构件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    @Override
    public void display(int depth) {
        //输出树形结构
        for(int i=0; i<depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);

        //下级遍历
        for (Component component : componentArrayList) {
            component.display(depth + 1);
        }
    }

}