package top.shmly.design.structural.decorator;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/14 19:45
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ConcreateComponent extends Component{
    @Override
    public void operate() {
        System.out.println("concreate do something");
    }
}
