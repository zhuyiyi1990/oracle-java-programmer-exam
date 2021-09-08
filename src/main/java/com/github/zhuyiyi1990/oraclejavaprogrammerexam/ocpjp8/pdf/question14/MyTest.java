package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question14;

public class MyTest {

    void doStuff() throws ArithmeticException, NumberFormatException, Exception {
        if (Math.random() > -1) {
            throw new Exception("Try again");
        }
    }

    void test() {
        try {
            doStuff();
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
