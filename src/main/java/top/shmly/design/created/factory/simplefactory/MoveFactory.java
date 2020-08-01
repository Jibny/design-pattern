package top.shmly.design.created.factory.simplefactory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 16:16
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class MoveFactory {

    public static MoveTool createCar() {
        //before processing do some thing
        return new Car();
    }

    public static MoveTool createPlane() {
        //before processing do some thing
        return new Plane();
    }
}
