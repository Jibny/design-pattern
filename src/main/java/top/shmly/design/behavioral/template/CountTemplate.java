package top.shmly.design.behavioral.template;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 15:34
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class CountTemplate extends AbstractTemplate {
    @Override
    protected int firstBehavior(String mesaage) {
        Map<Character, Integer> map = new HashMap();
        char c = 0;
        for (int i = 0; i < mesaage.length(); i++) {
            c = mesaage.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        map.forEach((k,v)-> System.out.println(k.toString()+":"+v.toString()));
        return map.size();
    }

    @Override
    protected void secondBehavior(int num) {
        System.out.println("不一样的字符有:"+num+"个");
        return ;
    }

    @Override
    protected void finallyBehavior() {
        System.out.println("最后执行统计结束-----");
    }
}
