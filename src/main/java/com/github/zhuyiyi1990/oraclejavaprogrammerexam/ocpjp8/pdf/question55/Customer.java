package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question55;

public class Customer {

    private String fName;

    private String lName;

    private static int count;

    public Customer(String first, String last) {
        fName = first;
        lName = last;
        ++count;
    }

    static {
        count = 0;
    }

    public static int getCount() {
        return count;
    }

}
