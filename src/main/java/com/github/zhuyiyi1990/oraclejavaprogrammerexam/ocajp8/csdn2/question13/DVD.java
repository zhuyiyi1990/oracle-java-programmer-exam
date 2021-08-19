package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question13;

class D {

    int d;

}

class CD extends D {

    int r;

    public CD(int r) {
        this.r = r;
    }

}

public class DVD extends CD {

    int c;

    public DVD(int r, int c, int d) {
        super(r);
//        super.r = r;
        this.r = r;
//        this.d = d;
        super.d = d;
//        super.super.d = d;
        this.c = c;
    }

}
