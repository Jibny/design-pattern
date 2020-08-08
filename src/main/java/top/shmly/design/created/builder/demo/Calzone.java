package top.shmly.design.created.builder.demo;

import lombok.ToString;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 17:45
 * @description: 半月型Pizza指定酱汁内置还是外置
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceInside=" + sauceInside +
                ", topings=" + topings +
                '}';
    }
}
