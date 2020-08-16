package top.shmly.design.structural.composite.transparent;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/15 23:42
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {

    public static void main(String[] args) {
        //创建根节点及其子节点
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        //创建第二层节点及其子节点
        Composite branch = new Composite("Composite X");
        branch.add(new Leaf("Leaf XA"));
        branch.add(new Leaf("Leaf XB"));
        root.add(branch);

        //创建第三层节点及其子节点
        Composite branch2 = new Composite("Composite XY");
        branch2.add(new Leaf("Leaf XYA"));
        branch2.add(new Leaf("Leaf XYB"));
        branch.add(branch2);

        //创建第二层节点
        root.add(new Leaf("Leaf C"));

        //创建第二层节点并删除
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        //打印
        root.display(1);
    }
}

