package top.shmly.design.structural.composite.demo03;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:43
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@SuperBuilder
public class Branch extends Crop {
    private String level = "";

    public Branch(String name, String position, Integer salary, String level) {
        super(name, position, salary);
        this.level = level;
    }

    private final List<Crop> subordinateInfoList = new LinkedList();


    @Override
    public void addSubordinate(Crop crop) {
        this.subordinateInfoList.add(crop);
    }

    @Override
    public List<Crop> getSubordinate() {
        return this.subordinateInfoList;
    }

}
