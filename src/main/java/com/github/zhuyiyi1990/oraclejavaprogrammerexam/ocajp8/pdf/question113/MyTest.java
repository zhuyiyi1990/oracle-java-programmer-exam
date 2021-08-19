package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question113;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyTest {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        dt = dt.plusDays(30);
        dt = dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }

}
