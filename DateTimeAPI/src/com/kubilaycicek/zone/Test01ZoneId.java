package com.kubilaycicek.zone;

import java.time.ZoneId;
import java.util.Set;

public class Test01ZoneId {
    public static void main(String[] args) {
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone);

        Set<String> zoneIds= ZoneId.getAvailableZoneIds();

        zoneIds.forEach(System.out::println);
    }
}
