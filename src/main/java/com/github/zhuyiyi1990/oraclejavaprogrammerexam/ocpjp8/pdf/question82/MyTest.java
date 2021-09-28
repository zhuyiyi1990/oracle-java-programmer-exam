package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question82;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class MyTest {

    public static void main(String[] args) {
        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
        long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is " + hrs + " hours");
        System.out.println("----------");
        depart = ZonedDateTime.of(2015, 1, 15, 11, 0, 0, 0, ZoneId.of("UTC-4"));
        arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
        hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is " + hrs + " hours");
        System.out.println("----------");
        depart = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC+18"));
        arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-18"));
        hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is " + hrs + " hours");
        System.out.println("----------");
        depart = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
        arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-4"));
        hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is " + hrs + " hours");
        System.out.println("----------");
        depart = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC+1"));
        arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-1"));
        hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is " + hrs + " hours");
    }

}
