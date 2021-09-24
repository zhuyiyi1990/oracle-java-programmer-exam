package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question9;

import java.util.Arrays;

public class TempTest {

    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 9991;
        }
        System.out.println(Arrays.stream(data).sum());
    }

}
