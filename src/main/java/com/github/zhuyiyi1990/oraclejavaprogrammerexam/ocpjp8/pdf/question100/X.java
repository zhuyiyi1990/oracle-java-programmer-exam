package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question100;

interface Z {

}

public class X implements Z {

    @Override
    public String toString() {
        return "X ";
    }

    public static void main(String[] args) {
        Y myY = new Y();
        X myX = myY;
        Z myZ = myX;
        System.out.print(myX);
        System.out.print((Y) myX);
        System.out.print(myZ);
    }

}

class Y extends X {

    @Override
    public String toString() {
        return "Y ";
    }

}