package com.kubilaycicek;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerTest01 {


    public static void main(String[] args) {

        Consumer<String> printLowerCase = str -> str.toLowerCase();
        printLowerCase.accept("KUBİLAY");


        Stream<String> stream = Stream.of("K", "U", "B", "İ", "L", "A", "Y");

        List<String> myList = stream.map(str -> str.toUpperCase()).collect(Collectors.toList());

        myList.forEach(System.out::println);


    }

}
