package com.kubilaycicek.localtime;

import java.time.LocalTime;

public class Test06LocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        localTime = localTime.plusHours(10).plusMinutes(4); // 10 saat 4 dakika sonrası

        System.out.println(localTime);
    }
}
