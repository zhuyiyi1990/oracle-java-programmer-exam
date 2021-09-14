package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question67;

import java.util.function.BiFunction;

public class MyTest {

    public static void main(String[] args) {
        BiFunction<Integer, Double, Double> val = (t1, t2) -> t1 + t2;
        System.out.println(val.apply(10, 10.5));
    }

}
