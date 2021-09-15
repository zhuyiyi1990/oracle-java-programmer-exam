package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question80;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyTest {

    public static void main(String[] args) throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\temp\\green.txt"))) {
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br;
        }
        brCopy.ready();
    }

}
