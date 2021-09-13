package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question38;

import java.util.Arrays;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        System.out.println(
                //A
                listVal.stream().filter(x -> x.length() > 3).count()
                //B
//                listVal.stream().map(x -> x.length() > 3).count()
                //C
//                listVal.stream().peek(x -> x.length() > 3).count().get()
                //D
//                listVal.stream().filter(x -> x.length() > 3).mapToInt(x -> x).count()
        );
    }

}
