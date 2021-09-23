package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question112;

public class Calculator {

    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        do {
            sum += num;
        } while ((num--) > 1);
        System.out.println("The sum is " + sum + ".");
    }

}
