package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) {
        Stream<Path> paths = Stream.of(Paths.get("D:\\temp\\data.doc"), Paths.get("D:\\temp\\data.txt"), Paths.get("D:\\temp\\data.xml"));
        paths.filter(s -> s.toString().endsWith("txt")).forEach(s -> {
            try {
                Files.readAllLines(s).stream().forEach(System.out::println);
            } catch (IOException e) {
                System.out.println("Exception");
            }
        });
    }

}
