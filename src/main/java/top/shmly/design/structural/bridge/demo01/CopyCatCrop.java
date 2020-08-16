package top.shmly.design.structural.bridge.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:55
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class CopyCatCrop extends Crop{
    public CopyCatCrop(Product _product) {
        super(_product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚钱啊。。。");
    }
}
