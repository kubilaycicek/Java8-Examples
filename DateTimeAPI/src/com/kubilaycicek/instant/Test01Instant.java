package com.kubilaycicek.instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class Test01Instant {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(instant);
    }

    /* Instants
     * Represents machine time starting from Unix epoch
     * Typically used for timestamps
     * */
}