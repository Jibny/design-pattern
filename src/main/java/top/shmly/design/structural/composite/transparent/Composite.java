package top.shmly.design.structural.composite.transparent;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/15 23:40
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Composite extends Component{
    private ArrayList<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public ArrayList<Component> getChildren() {
        return this.components;
    }


    @Override
    public void display(int depth) {
        //输出树形结构
        for(int i=0; i<depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);

        //下级遍历
        for (Component component : components) {
            component.display(depth + 1);
        }
    }
}
