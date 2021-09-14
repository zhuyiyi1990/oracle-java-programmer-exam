package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question57;

import java.util.concurrent.CyclicBarrier;

public class MyTest {

    public static void main(String[] args) {
        Master master = new Master();
        CyclicBarrier cb = new CyclicBarrier(1, master);
        Worker worker = new Worker(cb);
        worker.start();
    }

}
