package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question109;

class X {

    public void mX() {
        System.out.println("Xm1");
    }

}

class Y extends X {

    @Override
    public void mX() {
        System.out.println("Xm2");
    }

    public void mY() {
        System.out.println("Ym");
    }

}

public class Test {

    public static void main(String[] args) {
        X xRef = new Y();
        Y yRef = (Y) xRef;
        yRef.mY();
        xRef.mX();
    }

}