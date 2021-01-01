package com.kubilaycicek.localtime;

import java.time.LocalTime;

public class Test04LocalTime {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //15:59:21.474

        LocalTime localTime1 = LocalTime.of(2, 30);
        System.out.println(localTime1); // 02:30

        LocalTime localTime2 = LocalTime.of(2, 45, 10);
        System.out.println(localTime2); // 02:45:10

        LocalTime localTime3 = LocalTime.of(14,30,30,200);
        System.out.println(localTime3); //14:30:30:200

    }
}
