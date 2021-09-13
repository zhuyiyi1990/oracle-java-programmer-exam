package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question33;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Course {

    public static void main(String[] args) {
        int i;
        char c;
        try (InputStream fis = Course.class.getClassLoader().getResourceAsStream("course.txt"); InputStreamReader isr = new InputStreamReader(fis);) {
            while (isr.ready()) {
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
