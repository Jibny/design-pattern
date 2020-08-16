package top.shmly.design.structural.composite.demo03;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * @auther: Jibny Zhan
 * @date: 2020/8/15 23:45
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@SuperBuilder
public class Root extends Crop {
    private final List<Crop> subordinateInfoList = new ArrayList();

    public Root(String name, String position, Integer salary) {
        super(name, position, salary);
    }

    @Override
    public void addSubordinate(Crop crop) {
        this.subordinateInfoList.add(crop);
    }

    @Override
    public List<Crop> getSubordinate() {
        return this.subordinateInfoList;
    }

}
