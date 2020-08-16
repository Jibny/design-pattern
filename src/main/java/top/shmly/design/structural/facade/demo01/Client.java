package top.shmly.design.structural.facade.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 16:21
 * @description: 多职责，而且顺序不能乱，真的麻烦
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("Hello,It's me,This mail with to...");
        letterProcess.fillEnvelope("Happy road No.666,your friend...");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
