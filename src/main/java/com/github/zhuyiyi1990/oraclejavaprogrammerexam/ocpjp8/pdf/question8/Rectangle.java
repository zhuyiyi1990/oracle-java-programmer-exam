package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question8;

public class Rectangle extends Square {

    int len, br;

    public Rectangle(int x, int y) {
        super(x);
        len = x;
        br = y;
    }

    public void area() {
        System.out.println("Rectangle");
    }

}
