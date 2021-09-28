package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question49;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) {
//        A
        List<Integer> integers = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = integers.stream();
        System.out.println(stream.filter(n -> n > 0).count());
        System.out.println(stream.filter(n -> n > 0).count());
    }

}
