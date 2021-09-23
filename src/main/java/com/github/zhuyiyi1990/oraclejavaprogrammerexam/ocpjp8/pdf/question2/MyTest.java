package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question2;

import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

//选B
public class MyTest {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3);
//        IntFunction<Integer> inFu = x -> y -> x * y;
//        A
//        IntFunction<UnaryOperator> inFu = x -> y -> x * y;
//        B
        IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;
//        C
//        BiFunction<IntUnaryOperator> inFu = x -> y -> x * y;
        IntStream newStream = stream.map(inFu.apply(10));
//        D
//        IntStream newStream = stream.map(inFu.applyAsInt(10));
        newStream.forEach(System.out::println);
    }

}
