package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question47;

public class Shop {

    private Cake c = new Cake();

    private final double discount = 0.25;

    public void makeReady() {
        c.bake(10, 120);
    }

}
