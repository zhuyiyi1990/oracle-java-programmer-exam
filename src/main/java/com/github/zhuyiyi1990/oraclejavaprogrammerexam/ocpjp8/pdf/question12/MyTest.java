package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("courses.txt");
//        A
//        Stream<Path> fc = Files.list(file);
//        B
//        List<String> strings = Files.readAllLines(file);
//        D
        Stream<String> fc = Files.lines(file);
        fc.forEach(s -> System.out.println(s));
    }

}
