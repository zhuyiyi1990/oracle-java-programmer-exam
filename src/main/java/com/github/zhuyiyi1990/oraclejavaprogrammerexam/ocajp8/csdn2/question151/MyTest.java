package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question151;

import java.util.ArrayList;

public class MyTest {

    public static void main(String[] args) {
        double v = (22.00 - 0.3) / 3.10;
        float x = 22.00f % 3.10f;
        int y = 22 % 3;
        System.out.println(v + ", " + x + ", " + y);
        ArrayList<RuntimeException> exceptions = new ArrayList<>();
        exceptions.add((RuntimeException) new Exception());
    }

}
