package top.shmly.condition.lkp;

/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 23:06
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */

public class Person{
    private Computer c;

    public void clickCloseButton(){
        //现在你要开始关闭计算机了，正常来说你只需要调用close（）方法即可，
        //但是你发现Computer所有的方法都是公开的，该怎么关闭呢？于是你写下了以下关闭的流程：
        c.saveCurrentTask();
        c.closePower();
        c.close();

        //亦或是以下的操作
        c.closePower();

        //还可能是以下的操作
        c.close();
        c.closePower();
    }

}
