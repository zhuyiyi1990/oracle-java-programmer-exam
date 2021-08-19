package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question15;

public class MyTest {

    int i, j;

    private MyTest() {

    }

    private MyTest(int i) {
        this();
        this.i = i;
    }

    public MyTest(int i, int j) {
        this(i);
        this.j = j;
    }

    @Override
    public String toString() {
        return "MyTest{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public static void main(String[] args) {
        int k;
        MyTest myTest = new MyTest(1, 2);
        System.out.println(myTest);
//        System.out.println(k);
    }

}
