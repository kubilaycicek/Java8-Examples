package com.kubilaycicek.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test01Period {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, Month.MAY,13);
        LocalDate endDate = LocalDate.of(2021,Month.SEPTEMBER,25);

        Period period=Period.between(startDate,endDate);
        System.out.println(period);

        /* Output
        * P1Y4M12D
        * P-> Period
        * Y-> Year
        * D-> Day
        * */
    }
}
