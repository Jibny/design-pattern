package top.shmly.design.structural.composite.security;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 14:41
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void display(int depth) {
        //输出树形结构的叶子节点
        for(int i=0; i<depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);
    }

}