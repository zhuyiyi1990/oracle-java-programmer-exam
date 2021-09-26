package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question69;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class MyTest {

    public static void main(String[] args) {
//        UnaryOperator<Integer> uo1 = s -> s * 2;
        UnaryOperator<Double> uo1 = s -> s * 2;
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream().filter(lv -> lv >= 1500).map(lv -> uo1.apply(lv)).forEach(s -> System.out.print(s + " "));
        /*UnaryOperator<Double> uo1 = s -> s * 2;
        List<Integer> loanValues = Arrays.asList(1000, 2000);
        loanValues.stream().filter(lv -> lv >= 1500).map(lv -> uo1.apply(lv)).forEach(s -> System.out.print(s + " "));*/
    }

}
