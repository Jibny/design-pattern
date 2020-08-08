package top.shmly.design.created.builder.demo1;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 12:51
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class NutritionFacts1 {
    /** (ml)             requested */
    private final int servingSize;
    
    /** (per container)  requested */
    private final int servings;
    
    /** (g/serving)      optional */
    private final int calories;     
    
    /** (g/serving)      optional */
    private final int fat;
    
    /** (mg/serving)     optional */
    private final int sodium;       
    
    /** (g/serving)      optional */
    private final int carbohydrate; 
    
    public NutritionFacts1(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts1(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts1(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
