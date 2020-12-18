package com.kubilaycicek;

import java.util.function.Function;

public class FunctionTest01 {
    public static void main(String[] args) {
        Function<String, Integer> lengthF1 = (String str) -> str.length();
        Integer l1 = lengthF1.apply("kubilay");
        System.out.println(l1);
    }
}
