package top.shmly.condition.lkp;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 23:02
 * @description: Least Knowledge Principle 迪米特法则：一个对象应该对其他对象有最少的了解
 * <p>一个类对自己依赖的类知道的越少越好，也就是对于被依赖的类，向外公开的方法应该尽可能的少</p>
 * <p>从被依赖者的角度而言，只应该暴露应该暴露的方法</p>
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Computer{

    public void saveCurrentTask(){
        //do something
    }
    public void closeService(){
        //do something
    }
    public void closeScreen(){
        //do something
    }

    public void closePower(){
        //do something
    }

    public void close(){
        saveCurrentTask();
        closeService();
        closeScreen();
        closePower();
    }
}


