package com.kubilaycicek.zone;

import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

public class Test02ZoneId {
    public static void main(String[] args) {

        List<String> zoneIds = ZoneId.getAvailableZoneIds().stream().collect(Collectors.toList());
        System.out.println("Total Zone :" + zoneIds.stream().count());

    }
}
