package top.shmly.condition.ocp.original;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 23:20
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class NovelBook implements IBook {
    private String name;
    private Integer price;
    private String author;

    public NovelBook(String _name, Integer _price, String _author) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
