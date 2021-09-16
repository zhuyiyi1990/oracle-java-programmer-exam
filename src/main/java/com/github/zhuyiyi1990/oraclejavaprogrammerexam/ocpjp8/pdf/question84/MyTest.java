package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question84;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyTest {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("Searching...");
            return n.contains("red");
        };
        colors.stream().filter(c -> c.length() > 3).allMatch(test);
        System.out.println("----------");
        boolean b = colors.stream().filter(c -> c.length() > 3).allMatch(test);
    }

}
