package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question7;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Birdie {

    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);
    }

    static void fly(Supplier<? extends Bird> bird) {
        bird.get().fly();
    }

}
