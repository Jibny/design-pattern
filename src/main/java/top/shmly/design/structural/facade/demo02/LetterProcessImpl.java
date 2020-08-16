package top.shmly.design.structural.facade.demo02;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 16:18
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写写信内容:"+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("收信人姓名和地址："+address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中。。。");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件。。。");
    }
}
