package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question3;

import java.util.Arrays;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3);
        values.stream().map(n -> n * 2).peek(System.out::print).count();
    }

}
