package top.shmly.design.structural.composite.demo03;

import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:39
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@SuperBuilder
public class Leaf extends Crop {
    public Leaf(String name, String position, Integer salary) {
        super(name, position, salary);
    }

    @Override
    public void addSubordinate(Crop crop) {

    }

    @Override
    public List<Crop> getSubordinate() {
        return null;
    }
}
