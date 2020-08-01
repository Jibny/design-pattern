package top.shmly.design.created.factory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 13:24
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class HumanFactory extends AbstractFactory {
    @Override
    public <T extends Human> T creatHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("人种生成错误。。。");
        }
        return (T)human;
    }
}
