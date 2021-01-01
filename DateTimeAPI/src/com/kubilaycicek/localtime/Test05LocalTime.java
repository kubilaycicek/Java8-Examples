package com.kubilaycicek.localtime;

import java.time.LocalTime;

public class Test05LocalTime {
    public static void main(String[] args) {
        LocalTime parsed = LocalTime.parse("16:04");
        LocalTime parsed2 = LocalTime.parse("16:04:20");
        System.out.println(parsed); // 16:04
        System.out.println(parsed2); // 16:04:20
    }
}
