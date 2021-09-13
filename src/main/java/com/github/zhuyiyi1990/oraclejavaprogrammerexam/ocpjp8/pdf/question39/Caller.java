package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question39;

import java.util.concurrent.Callable;

public class Caller implements Callable<String> {

    String str;

    public Caller(String s) {
        this.str = s;
    }

    @Override
    public String call() throws Exception {
        return str.concat("Caller");
    }

}
