package top.shmly.design.structural.facade.demo02;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 16:26
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        ModernPostOffice modernPostOffice = new ModernPostOffice();
        String context = "Hello,It's me,This mail with to...";
        String address = "Happy road No.666,your friend...";
        modernPostOffice.sendLetter(context, address);
    }
}
// 填写写信内容:Hello,It's me,This mail with to...
// 收信人姓名和地址：Happy road No.666,your friend...
// 把信放到信封中。。。
// 投递前检查邮件。。。
// 邮递信件。。。