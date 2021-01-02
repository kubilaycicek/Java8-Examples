package com.kubilaycicek.duration;

import java.time.Duration;
import java.time.Period;

public class Test02Duration {
    public static void main(String[] args) {
        Duration d1 = Duration.ofDays(1);
        Period p1 = Period.ofDays(1);

        System.out.println(d1);   //PT24H
        System.out.println(p1); //P1D

        Duration d2 = Duration.ofHours(20);
        Duration d3 = Duration.ofHours(30);
        Duration d4 = Duration.ofHours(50);

        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

    }
}
