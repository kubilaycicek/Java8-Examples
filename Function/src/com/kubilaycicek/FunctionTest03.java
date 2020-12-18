package com.kubilaycicek;

import java.util.function.Function;

public class FunctionTest03 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = Math::abs;
        Function<Integer, Integer> f2 = (Integer number) -> {
            return Math.abs(number);
        };
        Function<Integer, Integer> f3 = (Integer number) -> Math.abs(number);

        Integer value = f3.apply(-5);

        System.out.println(value);
    }
}
