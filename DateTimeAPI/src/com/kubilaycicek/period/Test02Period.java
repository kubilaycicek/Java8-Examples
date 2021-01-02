package com.kubilaycicek.period;

import java.time.Period;

public class Test02Period {
    public static void main(String[] args) {
        Period p1 = Period.ofYears(2);
        Period p2 = Period.ofMonths(3);
        Period p3 = Period.ofMonths(12);
        Period p4 = Period.ofDays(25);
        Period p5 = Period.ofWeeks(4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}