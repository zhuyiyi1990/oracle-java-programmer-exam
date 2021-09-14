package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question57;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Worker extends Thread {

    CyclicBarrier cb;

    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            cb.await();
            System.out.println("Worker...");
        } catch (Exception ex) {

        }
    }

}
