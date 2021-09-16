package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question116;

public class MyTest {

    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int sum = 0;
        for (int frnt = 0, rear = lst.length - 1; frnt < 5 && rear >= 5; frnt++, rear--) {
            sum = sum + lst[frnt] + lst[rear];
        }
        System.out.print(sum);
    }

}
