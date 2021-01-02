package com.kubilaycicek.period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Test03Period {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        Period p1 = Period.ofMonths(2);
        date = date.plus(p1);

        System.out.println(date);

        /*
        LocalTime localTime = LocalTime.now();
        localTime.plus(p1);                         //UnsupportedTemporalTypeException
        */
    }
}
