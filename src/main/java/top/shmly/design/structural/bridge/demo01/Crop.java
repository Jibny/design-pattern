package top.shmly.design.structural.bridge.demo01;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 21:50
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Crop {
    private Product product;

    public Crop(Product _product) {
        this.product = _product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }

    public Product getProduct(){
        return this.product;
    }
}
