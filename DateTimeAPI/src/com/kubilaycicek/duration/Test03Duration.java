package com.kubilaycicek.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Test03Duration {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(6, 12);
        LocalTime end = LocalTime.of(2, 25);


        LocalDate startDate = LocalDate.of(2020,01,01);
        LocalDate ldate =  LocalDate.now();
        Period p1 = Period.between(startDate,ldate);
        System.out.println(p1);

        // Period p1 = Period.between(start,end); java: incompatible types: java.time.LocalTime cannot be converted to java.time.LocalDate

        Duration d1 = Duration.between(start, end);
        System.out.println(d1);


        //Duration -> Time  SAAT DAKIKA SANIYE..
        //Period -> Gün AY YIL HAFTA..
    }
}
