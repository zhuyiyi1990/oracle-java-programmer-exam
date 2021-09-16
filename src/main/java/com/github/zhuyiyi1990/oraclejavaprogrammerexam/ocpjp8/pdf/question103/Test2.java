package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question103;

public class Test2 {

    int fvar;

    static int cvar;

    public static void main(String[] args) {
        Test2 t = new Test2();
        //A
        t.fvar = 200;
        t.cvar = 400;
        //B
        /*fvar = 200;
        cvar = 400;*/
        //C
        /*this.fvar = 200;
        this.cvar = 400;*/
        //D
        t.fvar = 200;
        Test2.cvar = 400;
        //E
        /*this.fvar = 200;
        Test2.cvar = 400;*/
    }

}
