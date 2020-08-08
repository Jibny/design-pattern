package top.shmly.design.created.builder.demo;

import lombok.ToString;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @auther: Jibny Zhan
 * @date: 2020/8/8 17:00
 * @description: builder类层次的结构 （抽象的Pizza类，抽象的builder类，）
 * @Created By IntelliJ IDEA 2020.1.3
 */
public abstract class Pizza {
    // 火腿，蘑菇，洋葱，辣椒，香肠
    public enum Toping {HAM, MUSHROOM, ONION, PEPPER, SAUSACE}

    final Set<Toping> topings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Toping> topings = EnumSet.noneOf(Toping.class);

        public T addToppings(Toping toping) {
            topings.add(Objects.requireNonNull(toping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        topings = builder.topings.clone();
    }
}
