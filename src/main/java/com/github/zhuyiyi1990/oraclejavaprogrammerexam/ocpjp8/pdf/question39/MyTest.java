package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question39;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<String> f1 = es.submit(new Caller("Call"));
        Future<?> f2 = es.submit(new Runner("Run"));
        System.out.println("aaaaa");
        String str1 = f1.get();
        System.out.println("bbbbb");
        String str2 = (String) f2.get();
        System.out.println(str1 + ":" + str2);
    }

}
