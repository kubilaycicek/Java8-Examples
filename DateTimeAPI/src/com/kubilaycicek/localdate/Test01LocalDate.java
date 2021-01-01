package com.kubilaycicek.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Test01LocalDate {
    public static void main(String[] args) {

        Date date = new Date();

        LocalDate localDate = LocalDate.now();

        System.out.println(date); // Ay gün yıl saat.
        System.out.println(localDate); // Gün Ay Yıl tutulur.

        LocalDate localDate1 = LocalDate.of(2021, 1, 1);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.of(2020, Month.JANUARY, 1); //Month parametresi ENUM
        System.out.println(localDate2);
    }
}
