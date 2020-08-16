package top.shmly.design.structural.bridge.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:56
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        Product house = new House();
        Crop crop = new HouseCrop(house);
        crop.makeMoney();

        Crop copyCatCrop = new CopyCatCrop(new House());
        copyCatCrop.makeMoney();
        copyCatCrop = new CopyCatCrop(new Ipod());
        copyCatCrop.makeMoney();
    }
}
