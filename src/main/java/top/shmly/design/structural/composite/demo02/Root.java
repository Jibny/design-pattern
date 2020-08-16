package top.shmly.design.structural.composite.demo02;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


/**
 * @auther: Jibny Zhan
 * @date: 2020/8/15 23:45
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Root implements IRoot {
    private String position = "";
    private String name = "";
    private Integer salary = 0;
    private final List<ICrop> subordinateInfoList = new ArrayList();

    @Override
    public void addSubordinate(ICrop crop) {
        this.subordinateInfoList.add(crop);
    }

    @Override
    public List<ICrop> getSubordinate() {
        return this.subordinateInfoList;
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateInfoList.add(branch);
    }

    @Override
    public void add(Ileaf leaf) {
        this.subordinateInfoList.add(leaf);
    }

    @Override
    public List getSubordinateInfo() {
        return this.subordinateInfoList;
    }
}
