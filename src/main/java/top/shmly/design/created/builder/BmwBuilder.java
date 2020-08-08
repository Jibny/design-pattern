package top.shmly.design.created.builder;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 18:57
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class BmwBuilder extends CarBuiler {
    private CarModel bmwModel = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
