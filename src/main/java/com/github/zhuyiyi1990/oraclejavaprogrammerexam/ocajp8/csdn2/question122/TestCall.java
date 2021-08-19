package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question122;

class Caller {

    private void init() {
        System.out.println("Initialized");
    }

    public void start() throws Exception {
        init();
        System.out.println("Started");
//        throw new Exception("zhuyiyi");
    }

}

public class TestCall {

    public static void main(String[] args) {
        try {
            Caller c = new Caller();
            c.start();
        } catch (Exception e) {
            System.out.println("----------");
            System.out.println(e);
            System.out.println("----------");
            e.printStackTrace();
        }
    }

}
