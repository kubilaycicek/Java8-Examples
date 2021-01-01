package com.kubilaycicek.localdate;

import java.time.LocalDate;

public class Test03LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); //2021-01-01

        localDate = localDate.plusDays(5); //2021-01-06

        localDate = localDate.plusMonths(3); //2021-04-06

        System.out.println(localDate);

        //LocalDate objeleri immutabledir!
    }
}
