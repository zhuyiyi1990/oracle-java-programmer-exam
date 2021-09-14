package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question57;

import java.util.Random;

public class Master implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Master...");
    }

}
