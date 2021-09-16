package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question110;

public class Test2 {

    public static void main(String[] args) {
        int[] ar1 = {2, 4, 6, 8};
        int[] ar2 = {1, 3, 5, 7, 9};
        ar2 = ar1;
        for (int e2 : ar2) {
            System.out.print(" " + e2);
        }
    }

}
