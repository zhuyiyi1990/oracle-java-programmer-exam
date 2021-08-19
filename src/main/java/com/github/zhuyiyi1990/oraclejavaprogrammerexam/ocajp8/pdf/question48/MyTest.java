package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question48;

public class MyTest {

    public static void main(String[] args) {
        int[][] n = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int y : n[i]) {
                System.out.print(y);
            }
        }
    }

}
