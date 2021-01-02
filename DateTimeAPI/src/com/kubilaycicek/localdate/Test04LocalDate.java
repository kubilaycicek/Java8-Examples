package com.kubilaycicek.localdate;

import java.time.LocalDate;
import java.time.ZoneId;

public class Test04LocalDate {

    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate date = LocalDate.now(ZoneId.of("Asia/Singapore"));
        System.out.println(date);
    }
}
