package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question58;

import java.util.function.ToIntFunction;

public class MyTest {

    public static void main(String[] args) {
        String str = "Java is a programming language";
        ToIntFunction<String> indexVal = str::indexOf;
        int x = indexVal.applyAsInt("Java");
        System.out.println(x);
    }

}
