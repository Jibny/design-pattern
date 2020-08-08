package top.shmly.design.created.builder;

import java.util.ArrayList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 19:05
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private CarBuiler benzBuilder = new BenzBuilder();
    private CarBuiler bmwBuilder = new BmwBuilder();

    public CarModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add(CarEnum.START.getDesc());
        this.sequence.add(CarEnum.ALARM.getDesc());
        this.sequence.add(CarEnum.STOP.getDesc());
        this.benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }

    public CarModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add(CarEnum.START.getDesc());
        this.sequence.add(CarEnum.ALARM.getDesc());
        this.sequence.add(CarEnum.ENGINEBOOM.getDesc());
        this.sequence.add(CarEnum.STOP.getDesc());
        this.benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }

    public CarModel getABmwModel() {
        this.sequence.clear();
        this.sequence.add(CarEnum.START.getDesc());
        this.sequence.add(CarEnum.ENGINEBOOM.getDesc());
        this.sequence.add(CarEnum.ALARM.getDesc());
        this.bmwBuilder.setSequence(this.sequence);
        return bmwBuilder.getCarModel();
    }

    public CarModel getBBmwModel() {
        this.sequence.clear();
        this.sequence.add(CarEnum.START.getDesc());
        this.sequence.add(CarEnum.ALARM.getDesc());
        this.sequence.add(CarEnum.ENGINEBOOM.getDesc());
        this.bmwBuilder.setSequence(this.sequence);
        return bmwBuilder.getCarModel();
    }

}
