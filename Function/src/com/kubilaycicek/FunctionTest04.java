package com.kubilaycicek;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionTest04 {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;

        Arrays.stream("1,-2,3,-4,5,6".split(","))
                .map(parseInt).map(Math::abs).forEach(System.out::println);

    }
}
