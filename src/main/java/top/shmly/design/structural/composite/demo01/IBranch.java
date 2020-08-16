package top.shmly.design.structural.composite.demo01;

import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:23
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface IBranch {
    public String getInfo();
    public void add(IBranch branch);
    public void add(Ileaf leaf);
    public List getSubordinateInfo();
}
