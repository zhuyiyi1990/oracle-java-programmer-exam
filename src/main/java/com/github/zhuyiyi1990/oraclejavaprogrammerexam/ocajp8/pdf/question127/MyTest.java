package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question127;

import java.util.ArrayList;

public class MyTest {

    public static void main(String[] args) {
        ArrayList<Object> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
//        colors.add(3, "cyan");
//        colors.add(4, "cyan");
//        colors.add(0, "cyan");
        colors.add(-1, "cyan");
        System.out.println(colors);
    }

}
