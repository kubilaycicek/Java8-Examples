package com.kubilaycicek.travel;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FlightTravel {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy hh.mm a");

        // Levaing on 1st Jan 2016, 6:00am from "Singapore"
        ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0),
                ZoneId.of("Asia/Singapore"));

        // Arrival on the same day in 10 hours in "Auckland
        System.out.println(ZoneId.of("Asia/Singapore").getRules());
        System.out.println(ZoneId.of("Pacific/Auckland").getRules());

        ZonedDateTime arrival = departure.withZoneSameInstant(ZoneId.of("Pacific/Auckland")).plusHours(10);
        System.out.println("Arrival : " + dateTimeFormatter.format(arrival));


        /*
        * ZoneRules[currentStandardOffset=+08:00]
          ZoneRules[currentStandardOffset=+12:00]
          Arrival : 01 01 2016 09.00 PM
        * */
    }
}
