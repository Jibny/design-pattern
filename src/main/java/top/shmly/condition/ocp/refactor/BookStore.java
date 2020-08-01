package top.shmly.condition.ocp.refactor;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 23:20
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class BookStore {
    private final static List<IBook> books = new ArrayList<>();

    static {
        books.add(new OffNovelBook("天龙八部", 5250, "金庸"));
        books.add(new OffNovelBook("巴黎圣母院", 5666, "雨果"));
        books.add(new OffNovelBook("悲惨世界", 3600, "雨果"));
        books.add(new OffNovelBook("金瓶梅", 4600, "兰陵笑笑生"));
    }

    //模拟书店买书
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println("-----------卖出书籍如下记录--------------");
        for (IBook iBook : books) {
            System.out.println("书籍名称：《" + iBook.getName() + "》, 书籍作者：" + iBook.getAuthor() +
                    ", 书籍打折后的价格" + numberFormat.format(iBook.getPrice() / 100.0) + "元");
        }
    }
}
