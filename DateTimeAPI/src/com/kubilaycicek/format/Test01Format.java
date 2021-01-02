package com.kubilaycicek.format;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test01Format {
    public static void main(String[] args) {
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyy");

        System.out.println(customFormat.format(LocalDate.of(2021, Month.JANUARY, 1)));
    }
}
