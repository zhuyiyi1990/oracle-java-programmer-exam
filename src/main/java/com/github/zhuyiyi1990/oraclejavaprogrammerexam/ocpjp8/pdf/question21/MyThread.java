package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question21;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {

    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        int x = count.incrementAndGet();
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread[] ta = {thread1, thread2, thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }

}
