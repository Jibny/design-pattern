package top.shmly.design.structural.flyweight;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/13 19:59
 * @description:
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Flyweight<TI, TO> {
    private final TI internalState;
    private TO externalState;

    public Flyweight(TI _internalState) {
        this.internalState = _internalState;
    }

    public abstract void operation();

    public TI getInternalState() {
        return internalState;
    }

    public TO getExternalState() {
        return externalState;
    }

    public void setExternalState(TO externalState) {
        this.externalState = externalState;
    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "internalState=" + internalState +
                ", externalState=" + externalState +
                '}';
    }
}
