package com.kubilaycicek;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest01 {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> supplier = random::nextInt;

        Stream.generate(supplier).limit(5).forEach(System.out::println);
    }
}
