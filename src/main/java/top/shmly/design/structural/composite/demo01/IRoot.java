package top.shmly.design.structural.composite.demo01;

import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:20
 * @description: 分三层root根节点，branch非叶子节点，leaf叶子节点
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IRoot {
    public String getInfo();
    public void add(IBranch branch);
    public void add(Ileaf leaf);
    public List getSubordinateInfo();
}
