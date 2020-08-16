package top.shmly.design.structural.facade.demo02;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 16:13
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public interface ILetterProcess {
    // 写信过程，1.写内容
    void writeContext(String context);
    // 2.地址
    void fillEnvelope(String address);
    // 3.装到信封
    void letterInotoEnvelope();
    // 4.寄信
    public void sendLetter();
}
