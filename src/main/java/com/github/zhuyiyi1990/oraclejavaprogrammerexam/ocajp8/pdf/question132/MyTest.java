package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question132;

import java.util.Arrays;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
//        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        List<String> arrList = Arrays.asList(arr);
        if (arrList.removeIf((String s) -> {
            return s.length() <= 2;
        })) {
            System.out.println("removed");
        }
    }

}
