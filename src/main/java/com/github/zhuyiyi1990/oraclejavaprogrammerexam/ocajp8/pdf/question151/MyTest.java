package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question151;

public class MyTest {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i].equals("D")) {
                System.out.println("Work done");
                break;
            }
            continue;
        }
    }

}
