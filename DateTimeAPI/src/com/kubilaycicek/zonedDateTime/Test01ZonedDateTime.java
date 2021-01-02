package com.kubilaycicek.zonedDateTime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Test01ZonedDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
    }
}

//LocalDateTime -> LocalDate + LocalTime
//ZonedDateTime -> LocalDateTime + ZoneId
