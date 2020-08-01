package top.shmly.condition.dip;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 20:19
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Driver implements IDriver {

    @Override
    public void drive(ICar car) {
            car.run();
    }
}
