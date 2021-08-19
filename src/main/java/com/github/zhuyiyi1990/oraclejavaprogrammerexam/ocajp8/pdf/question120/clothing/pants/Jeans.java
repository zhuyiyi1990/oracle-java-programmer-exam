package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question120.clothing.pants;

import static com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question120.clothing.Shirt.getColor;

public class Jeans {

    public void matchShirt() {
        String color = getColor();
        if (color.equals("Green")) {
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }

}
