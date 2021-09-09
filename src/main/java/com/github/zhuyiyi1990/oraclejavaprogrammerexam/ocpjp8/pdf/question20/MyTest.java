package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("/Pics/MyPic.jpeg");
        System.out.println(p1.getNameCount() + ":" + p1.getName(1) + ":" + p1.getFileName());
    }

}
