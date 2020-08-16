package top.shmly.design.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 16:24
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InternalObject {
    private Integer age;
    private String device;
}
