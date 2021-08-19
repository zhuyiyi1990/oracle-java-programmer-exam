package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question87;

public class Series {

    private boolean flag;

    public void displaySeries() {
        int num = 2;
        while (flag) {
            if (num % 7 == 0) {
                flag = false;
                System.out.println(num);
                num += 2;
            }
        }
    }

    public static void main(String[] args) {
        int a[];
        new Series().displaySeries();
    }

}
