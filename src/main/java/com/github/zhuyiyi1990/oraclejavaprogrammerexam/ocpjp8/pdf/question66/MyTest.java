package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question66;

import java.time.LocalDate;
import java.time.Month;

public class MyTest {

    public static void main(String[] args) {
        LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        nextYear.plusDays(15);
        System.out.println(nextYear);
    }

}
