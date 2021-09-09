package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) throws IOException {
        Stream<Path> files = Files.walk(Paths.get("D:\\temp"));
        files.forEach(fName -> {
            try {
                Path aPath = fName.toAbsolutePath();
                System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

}
