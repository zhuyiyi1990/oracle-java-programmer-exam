package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question180;

public class ColorTest {

    public static void main(String[] args) {
        String[] colors = {"red", "blue"};
        int count = 0;
        for (String c : colors) {
            if (count >= 4) {
//                break;
            } else {
//                continue;
            }
            if (c.length() >= 4) {
                colors[count] = c.substring(0, 3);
            }
        }
    }

}
