package top.shmly.design.created.builder.demo;

import java.util.EnumSet;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 17:08
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class EnumSetDemo {

    // create an enum
    public enum Numbers {

        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create a set that contains all Numbers class
        EnumSet<Numbers> set1 = EnumSet.allOf(Numbers.class);

        // print set1
        System.out.println("Set1:" + set1);

        // create a second set which is empty
        EnumSet<Numbers> set2 = EnumSet.noneOf(Numbers.class);

        set2.add(Numbers.ONE);
        // print the new set
        System.out.println("Set2:" + set2);
    }
}


