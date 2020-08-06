package top.shmly.design.created.prototype.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/6 19:09
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail {
    // 收信人
    private String receiver;
    // 邮件名称
    private String subject;
    // 称谓
    private String applicetion;
    // 邮件内容
    private String context;
    //邮件尾部标识
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }
}
