package top.shmly.design.created.builder;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/7 0:23
 * @description: 建造者模式：将一个复杂对象的构建与它的表示分离， 使得同样的构建过程可以创建不同的表示
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (CarEnum.START.getDesc().equalsIgnoreCase(actionName)) {
                this.start();
            }else if(CarEnum.STOP.getDesc().equalsIgnoreCase(actionName)){
                this.stop();
            }else if (CarEnum.ALARM.getDesc().equalsIgnoreCase(actionName)){
                this.alarm();
            }else if(CarEnum.ENGINEBOOM.getDesc().equalsIgnoreCase(actionName)){
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
