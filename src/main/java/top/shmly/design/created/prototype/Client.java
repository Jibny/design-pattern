package top.shmly.design.created.prototype;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/6 19:15
 * @description: 原型模式：用原型实例指定创建对象的种类， 并且通过拷贝这些原型创建新的对象
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    private static final int MAX_COUNT = 20000;
    private static final int MAX_POOL = 200;
    private static final int KEEP_LIVE = 1000;

    // 定义一个创建线程的工厂 打印一下创建线程时候的线程ID
    static class MailTreadFactory implements ThreadFactory {

        private final AtomicInteger mThreadNum = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, "mail-thread-#####" + mThreadNum.getAndIncrement());
            System.out.println(t.getName() + " has been created");
            return t;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(200, MAX_POOL, KEEP_LIVE,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(), new MailTreadFactory());
        Mail mail = new Mail(AdvTemplate.builder().advSubject("xxx优惠活动").advContext("活动内容，抽奖买一送一").build());
        mail.setTail("XXX公司版权所有");
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            Mail mailClone = (Mail) mail.clone();
            // 通过线程池去执行任务
            threadPoolExecutor.execute(() -> sendMail(mailClone));
        }
        Long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);
        threadPoolExecutor.shutdown();
    }

    private static void sendMail(Mail mail) {
        mail.setApplicetion(getRandomString(5) + " 先生(女士)");
        mail.setReceiver(getRandomString(8) + "@" + getRandomString(5) + ".com");
        System.out.println("title: " + mail.getSubject() + "\tcontext:" + mail.getContext() +
                "\t 收信人:" + mail.getReceiver() + "\t发送成功。。。" + System.currentTimeMillis());
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
