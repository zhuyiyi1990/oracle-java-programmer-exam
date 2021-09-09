package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question27;

public enum USCurrency {

    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    private int value;

    USCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
