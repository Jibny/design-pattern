package top.shmly.design.structural.bridge.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:52
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class HouseCrop extends Crop{
    public HouseCrop(Product _product) {
        super(_product);
    }

    @Override
    public void makeMoney() {
        super.getProduct().beProducted();
        this.sell();
        super.getProduct().beSelled();
    }

    public void sell(){
        System.out.println("房地产公司HouseCrop自己也能建房子卖。。。");
    }

}
