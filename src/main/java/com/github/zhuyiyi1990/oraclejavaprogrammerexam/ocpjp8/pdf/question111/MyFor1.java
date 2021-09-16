package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question111;

public class MyFor1 {

    public static void main(String[] args) {
        int[] x = {6, 7, 8};
        for (int i : x) {
            i++;
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int i : x) {
            System.out.print(i + " ");
        }
    }

}
