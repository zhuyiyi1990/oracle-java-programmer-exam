package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question123;

import java.util.ArrayList;
import java.util.List;

class Alpha {

    public String doStuff(String msg) {
        return msg;
    }

}

class Beta extends Alpha {

    @Override
    public String doStuff(String msg) {
        return msg.replace('a', 'e');
    }

}

class Gamma extends Beta {

    @Override
    public String doStuff(String msg) {
        return msg.substring(2);
    }

}

public class MyTest {

    public static void main(String[] args) {
        List<Alpha> strs = new ArrayList<>();
        strs.add(new Alpha());
        strs.add(new Beta());
        strs.add(new Gamma());
        for (Alpha t : strs) {
            System.out.println(t.doStuff("Java"));
        }
    }

}
