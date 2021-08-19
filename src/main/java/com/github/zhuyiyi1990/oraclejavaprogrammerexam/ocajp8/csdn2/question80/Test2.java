package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question80;

import java.time.LocalTime;

public class Test2 {

    int fvar;

    static int cvar;

    public static void main(String[] args) {
        Test2 t = new Test2();
        //insert code here to write field variables
        t.fvar = 200;
        cvar = 400;
        Test2.cvar = 400;
        LocalTime now = LocalTime.now();
        System.out.println(2 % 7);
    }

}
