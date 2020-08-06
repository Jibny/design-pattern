package top.shmly.design.created.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/6 19:10
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdvTemplate {
    // 广告信名称
    private String advSubject;
    // 广告信内容
    private String advContext;

}
