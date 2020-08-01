package top.shmly.design.created.factory.simplefactory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 15:53
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class DriverClient {
    public static void main(String[] args) throws ClassNotFoundException {
        AbstractFactory factory = new CreateMoveFactory();
        //@Value(${class.path})
        String path = "top.shmly.design.created.factory.simplefactory.Plane";
        Class clazz = Class.forName(path);
        MoveTool moveTool = factory.create(clazz);
        moveTool.run();
    }
}
