package top.shmly.design.created.builder.demo1;

import java.util.Objects;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 16:16
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(20, 30)
                .calories(10).fat(20).sodium(30).carbohydrate(40).build();
        System.out.println(nutritionFacts.toString());
    }
}
