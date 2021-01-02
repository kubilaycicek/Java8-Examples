package com.kubilaycicek.format;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test02Format {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
        System.out.println(dateTimeFormatter.format(date));


        LocalTime localTime =LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(timeFormatter.format(localTime));

    }
}