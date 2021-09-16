package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question113.p3;

import com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question113.p1.DoInterface;

public class DoClass implements DoInterface {

    int x1, x2;

    //    DoClass() {
    public DoClass() {
        this.x1 = 0;
        this.x2 = 10;
    }

    @Override
    public void m1(int p1) {
        x1 += p1;
        System.out.println(x1);
    }

    @Override
    public void m2(int p1) {
        x2 += p1;
        System.out.println(x2);
    }

}
