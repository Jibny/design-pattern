package top.shmly.design.created.builder.demo;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 17:58
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Client {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .addToppings(Pizza.Toping.HAM)
                .addToppings(Pizza.Toping.PEPPER)
                .addToppings(Pizza.Toping.SAUSACE).build();
        System.out.println(nyPizza.toString());
        Pizza calzone = new Calzone.Builder().sauceInside().addToppings(Pizza.Toping.HAM).addToppings(Pizza.Toping.ONION).build();
        System.out.println(calzone.toString());
    }
}
