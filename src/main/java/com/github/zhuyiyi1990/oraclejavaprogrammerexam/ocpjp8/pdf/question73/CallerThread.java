package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question73;

import java.util.concurrent.*;

public class CallerThread implements Callable<String> {

    String str;

    public CallerThread(String s) {
        this.str = s;
    }

    @Override
    public String call() throws Exception {
        return str.concat("Call");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<String> f1 = es.submit(new CallerThread("Call"));
        String str = f1.get().toString();
        System.out.println(str);
    }

}
