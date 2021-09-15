package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question77;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyTest {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("D:\\temp\\green.txt");
        Path target = Paths.get("D:\\temp\\colors\\yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
    }

}
