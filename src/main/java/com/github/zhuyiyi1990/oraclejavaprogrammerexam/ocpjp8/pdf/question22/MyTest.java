package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter GDP:");
        //A
        int GDP = Integer.parseInt(br.readLine());
        //B
//        int GDP = br.read();
        //C
//        int GDP = br.nextInt();
        //D
//        int GDP = Integer.parseInt(br.next());
        System.out.println(GDP);
    }

}
