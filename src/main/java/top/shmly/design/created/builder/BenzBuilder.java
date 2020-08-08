package top.shmly.design.created.builder;

import top.shmly.condition.dip.Benz;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 18:57
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class BenzBuilder extends CarBuiler{
    private CarModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
