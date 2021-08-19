package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn.question21;

public class TestApp {

    public static void main(String[] args) {
        TestApp t = new TestApp();
        try {
//            t.doPrint();
            t.doList();
        } catch (Exception e2) {
            System.out.println("Caught " + e2);
        }
    }

    public void doList() throws Exception {
        throw new Error("Error");
    }

    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }

}
