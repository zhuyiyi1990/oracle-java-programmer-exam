package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question60;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MyTest {

    public static void main(String[] args) {
        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Hello: ".concat(s);
        nL.stream().map(funVal).peek(System.out::print);
        System.out.println("----------");
        nL.stream().map(funVal).peek(System.out::print).forEach(t -> System.out.println());
    }

}
