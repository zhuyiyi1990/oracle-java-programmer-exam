package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question54;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class MyTest {

    public static void main(String[] args) {
        List<Integer> codes = Arrays.asList(10, 20);
//        UnaryOperator<Double> uo = s -> s + 10;
        UnaryOperator<Integer> uo = s -> s + 10;
        codes.replaceAll(uo);
        codes.forEach(c -> System.out.println(c));
    }

}
