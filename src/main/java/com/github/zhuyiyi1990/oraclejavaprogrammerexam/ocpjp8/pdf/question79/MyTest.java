package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question79;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);
        //A
        Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(s -> System.out.print(s + " "));
        //B
//        System.out.println("----------");
//        Stream.of(list1, list2).flatMap(list -> list.intStream()).forEach(s -> System.out.print(s + " "));
        //C
//        System.out.println("----------");
//        list1.stream().flatMap(list2.stream().flatMap(e1 -> e1.stream())).forEach(s -> System.out.print(s + " "));
        //D
//        System.out.println("----------");
//        Stream.of(list1, list2).flatMapToInt(list -> list.stream()).forEach(s -> System.out.print(s + " "));
    }

}
