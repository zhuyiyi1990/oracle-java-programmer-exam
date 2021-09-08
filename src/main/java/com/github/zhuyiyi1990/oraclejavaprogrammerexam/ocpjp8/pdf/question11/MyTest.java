package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) {
        Stream<List<String>> iStr = Stream.of(Arrays.asList("1", "John"), Arrays.asList("2", null));
//        Stream<String> nInSt = iStr.flatMapToInt((x) -> x.stream());
        Stream<String> nInSt = iStr.flatMap((x) -> x.stream());
        nInSt.forEach(System.out::print);
    }

}
