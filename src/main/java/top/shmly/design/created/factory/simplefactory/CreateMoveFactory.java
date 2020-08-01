package top.shmly.design.created.factory.simplefactory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 16:56
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class CreateMoveFactory extends AbstractFactory{
    @Override
    public <T extends MoveTool> T create(Class<T> c) {
        MoveTool moveTool = null;
        try {
            moveTool = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) moveTool;
    }
}
