package top.shmly.design.structural.composite.demo02;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/16 0:39
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Leaf implements Ileaf {
    private String name = "";
    private String position = "";
    private Integer salary = 0;

    @Override
    public String getInfo() {
        return this.toString();
    }

}
