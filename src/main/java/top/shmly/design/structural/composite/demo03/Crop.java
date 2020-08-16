package top.shmly.design.structural.composite.demo03;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 1:36
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Crop {
    private String name = "";
    private String position = "";
    private Integer salary = 0;

    public String getInfo() {
        return this.toString();
    }

    public abstract void addSubordinate(Crop crop);
    public abstract List<Crop> getSubordinate();
}
