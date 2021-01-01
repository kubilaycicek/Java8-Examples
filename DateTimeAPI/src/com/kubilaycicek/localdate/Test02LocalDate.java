package com.kubilaycicek.localdate;

import java.time.LocalDate;

public class Test02LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.ofYearDay(2021, 1); //2021'in 1inci günü
        System.out.println(localDate);

        LocalDate epoch = LocalDate.ofEpochDay(1000); //1970 1 January 00.00.00.000
        System.out.println(epoch);

        LocalDate localDate1 = LocalDate.parse("2021-01-01"); // String olarak girilen tarihi parse eder. (YYYY-MM-DD)
        System.out.println(localDate1);
    }
}
