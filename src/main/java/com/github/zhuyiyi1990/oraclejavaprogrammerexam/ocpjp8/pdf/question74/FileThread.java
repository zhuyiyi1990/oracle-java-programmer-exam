package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question74;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class FileThread implements Runnable {

    String fName;

    public FileThread(String fName) {
        this.fName = fName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fName);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("D:\\temp"));
        listOfFiles.forEach(line -> {
            executor.execute(new FileThread(line.getFileName().toString()));
        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.DAYS);
    }

}
