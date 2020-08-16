package top.shmly.design.structural.facade.demo02;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 16:48
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class ModernPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();
    // 写信，地址，投递一体化
    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        // 新增检查信件
        police.check(letterProcess);
        letterProcess.sendLetter();
    }
}
