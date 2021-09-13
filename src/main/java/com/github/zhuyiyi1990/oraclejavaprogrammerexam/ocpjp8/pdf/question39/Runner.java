package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question39;

public class Runner implements Runnable {

    String str;

    public Runner(String s) {
        this.str = s;
    }

    @Override
    public void run() {
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(str.concat("Runner"));
    }

}
