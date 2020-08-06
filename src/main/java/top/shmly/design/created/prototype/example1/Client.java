package top.shmly.design.created.prototype.example1;

import java.util.Random;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/6 19:15
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    private static final int MAX_COUNT = 5;

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail(AdvTemplate.builder().advSubject("xxx优惠活动").advContext("活动内容，抽奖买一送一").build());
        mail.setTail("XXX公司版权所有");
        for (int i = 0; i < MAX_COUNT; i++) {
            sendMail(mail);
        }

    }

    private static void sendMail(Mail mail) {
        mail.setApplicetion(getRandomString(5) + " 先生(女士)");
        mail.setReceiver(getRandomString(8) + "@" + getRandomString(5) + ".com");
        System.out.println("title: " + mail.getSubject() + "\tcontext:" + mail.getContext() +
                "\t 收信人:" + mail.getReceiver() + "\t发送成功。。。");
    }


    private static String getRandomString(int length) {
        String baseChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(baseChar.charAt(random.nextInt(baseChar.length())));
        }
        return stringBuffer.toString();
    }
}
