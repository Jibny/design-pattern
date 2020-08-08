package top.shmly.design.created.builder;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 18:10
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class CarBuiler {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
