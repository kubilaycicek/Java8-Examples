package com.kubilaycicek.chronounit;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test01ChronoUnit {
    public static void main(String[] args) {
        LocalTime one = LocalTime.of(5,15);
        LocalTime two = LocalTime.of(6,30);
        LocalDate date = LocalDate.of(2021,1,2);

        System.out.println(ChronoUnit.HOURS.between(one,two));
        System.out.println(ChronoUnit.MINUTES.between(one,two));
        System.out.println(ChronoUnit.MINUTES.between(one,date)); // Java DateTimeException !

    }
}
