package top.shmly.design.structural.composite.transparent;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/15 23:24
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Deprecated
    @Override
    public void add(Component component) {
        throw  new UnsupportedOperationException();
    }
    @Deprecated
    @Override
    public void remove(Component component) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void display(int depth) {
        //输出树形结构的叶子节点
        for(int i=0; i<depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);
    }

    @Deprecated
    @Override
    public ArrayList<Component> getChildren() {
        throw  new UnsupportedOperationException();
    }
}
