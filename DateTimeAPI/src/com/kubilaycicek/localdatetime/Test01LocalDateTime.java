package com.kubilaycicek.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test01LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();  //Date & Time bilgilerini tutar.
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, Month.JANUARY,1,16,17,20,200);

        System.out.println(localDateTime2);
    }
}
