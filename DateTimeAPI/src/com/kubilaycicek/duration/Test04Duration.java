package com.kubilaycicek.duration;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Test04Duration {
    public static void main(String[] args) {

        System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());
        System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());
        /*
        60
        3600
        86400
        */
    }
}
