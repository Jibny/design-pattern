package top.shmly.design.behavioral.template;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 15:07
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate template = new SpaceTemplate();
        template.templateOrder("nishuodedui");

        AbstractTemplate template1 = new CountTemplate();
        template1.templateOrder("nishuodedui");
    }
}
// first--->
// String length is 11
// second--->
// 消耗空间:22字节
// finally--->
// 最后执行消耗结束-----
// first--->
// s:1
// d:2
// u:2
// e:1
// h:1
// i:2
// n:1
// o:1
// second--->
// 不一样的字符有:8个
// finally--->
// 最后执行统计结束-----