package com.kubilaycicek.localdatetime;

import java.time.LocalDateTime;

public class Test02LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.MAX; //Desteklediği max tarih
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse("2021-01-01T16:17:20.000000200");
        System.out.println(localDateTime1);

    }
}
