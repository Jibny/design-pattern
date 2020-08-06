package top.shmly.design.created.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/6 19:09
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail implements Cloneable, Serializable {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  //序列化对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            mail = (Mail) ois.readObject();  //反序列化对象
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mail;
        // return super.clone();
    }

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }
}
