package com.kubilaycicek.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test03LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println();

        int day = localDateTime.getDayOfMonth();
        int dayOfweek = localDateTime.getDayOfWeek().getValue();
        int dayOfYear = localDateTime.getDayOfYear();

        System.out.println("Day :" + day);
        System.out.println("Day Of Week : " + dayOfweek);
        System.out.println("Day Of Year : " + dayOfYear);

    }
}
