package top.shmly.design.created.builder.demo1;

import lombok.ToString;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 16:02
 * @description: builder模拟具名的可选参数
 * @Created By IntelliJ IDEA 2020.1.3
 */
@ToString
public class NutritionFacts {
    /**
     * (ml)             requested
     */
    private final int servingSize;

    /**
     * (per container)  requested
     */
    private final int servings;

    /**
     * (g/serving)      optional
     */
    private final int calories;

    /**
     * (g/serving)      optional
     */
    private final int fat;

    /**
     * (mg/serving)     optional
     */
    private final int sodium;

    /**
     * (g/serving)      optional
     */
    private final int carbohydrate;


    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }


    public static class Builder {
        /**
         * requested parameter
         */
        private final int servingSize;
        private final int servings;
        /**
         * optional parameter - initialized to default values
         */
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
