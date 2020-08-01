package top.shmly.condition.ocp.refactor;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/1 0:38
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class OffNovelBook extends NovelBook {

    public OffNovelBook(String _name, Integer _price, String _author) {
        super(_name, _price, _author);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > 50) {
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
