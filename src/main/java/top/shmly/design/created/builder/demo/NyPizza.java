package top.shmly.design.created.builder.demo;

import lombok.ToString;

import java.util.Objects;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 17:36
 * @description: 纽约风味Pizza指定尺寸大小
 * @Created By IntelliJ IDEA 2020.1.3
 */
public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", topings=" + topings +
                '}';
    }
}
