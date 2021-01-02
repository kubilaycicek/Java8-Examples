package com.kubilaycicek.zonedDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test02ZonedDateTime {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Europe/Paris");

        LocalDateTime ldt = LocalDateTime.now(zoneId);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId);

        System.out.println(zdt);   // from EUROPA/PARIS

        LocalDate localDate = zdt.toLocalDate();
        LocalDateTime localDateTime = zdt.toLocalDateTime();
        System.out.println(localDate);
        System.out.println(localDateTime);

    }
}

//LocalDateTime -> LocalDate + LocalTime
//ZonedDateTime -> LocalDateTime + ZoneId