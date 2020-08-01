package top.shmly.design.created.factory.simplefactory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 16:56
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class PlaneFactory {
    public static MoveTool create() {
        //before processing do some thing
        return new Plane();
    }
}
