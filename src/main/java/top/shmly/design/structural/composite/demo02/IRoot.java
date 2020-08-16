package top.shmly.design.structural.composite.demo02;

import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:20
 * @description: 分三层root根节点，branch非叶子节点，leaf叶子节点
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IRoot extends ICrop {
    public void addSubordinate(ICrop crop);
    public List<ICrop> getSubordinate();

    @Deprecated
    public void add(IBranch branch);
    @Deprecated
    public void add(Ileaf leaf);
    @Deprecated
    public List getSubordinateInfo();
}
