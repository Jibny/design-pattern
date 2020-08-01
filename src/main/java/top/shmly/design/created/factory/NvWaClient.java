package top.shmly.design.created.factory;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 13:29
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class NvWaClient {
    public static void main(String[] args) {
        AbstractFactory createFactory = new HumanFactory();
        //通过工厂传入不同Human接口实现类生成不同人种
        Human whiteHuman = createFactory.creatHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human yellowHuman = createFactory.creatHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        Human blackHuman = createFactory.creatHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
