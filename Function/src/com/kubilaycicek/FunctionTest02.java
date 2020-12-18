package com.kubilaycicek;

import java.util.function.Function;

public class FunctionTest02 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = Integer::parseInt;

        Function<String, Integer> f2 = s -> {
            return Integer.parseInt(s);
        };

        Function<String, Integer> f3 = s -> Integer.parseInt(s);
        Integer value = f3.apply("100");

        System.out.println(value);
    }
}
