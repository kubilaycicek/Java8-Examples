package com.kubilaycicek.duration;

import java.time.Duration;
import java.time.LocalTime;

public class Test01Duration {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(10,30);
        LocalTime now = LocalTime.now();

        Duration d1 = Duration.between(localTime,now);
        System.out.println(d1);

        //PT58M5.906S
        /*
        * PT
        * H->Hours
        * M- Minutes
        * S- Second
        * */
    }
}
