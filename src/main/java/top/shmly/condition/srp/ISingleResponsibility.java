package top.shmly.condition.srp;


/**
 * @auther: Jibny Zhan
 * @date: 2020/7/31 16:33
 * @description: Single Responsibility Principle,单一职责原则：接口职责单一化，应该有且仅有一个原因引起类的变更
 * <p>通俗来讲，职责分离，降低了类的复杂性和变更时引起的风险，提高可读性可维护性，注意：职责和变化因具体项目业务而异</p>
 * @Created By IntelliJ IDEA 2020.1.3
 */

public interface ISingleResponsibility {
    /**
     * 方法应该只做一件事，做好一件事
     */
    void responsibility();

}
