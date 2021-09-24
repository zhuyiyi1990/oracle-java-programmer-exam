package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyTest {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("D:\\temp\\test\\a.txt");
//        Path destination = Paths.get("D:\\temp");
        Path destination = Paths.get("D:\\temp\\b.txt");
        Files.copy(source, destination);
    }

}
