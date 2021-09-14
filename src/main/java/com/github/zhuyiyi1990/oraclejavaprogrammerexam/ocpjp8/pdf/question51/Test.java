package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question51;

import java.io.IOException;

final class Folder implements AutoCloseable {

    public void close() throws IOException {
        System.out.print("Close");
    }

    public void open() {
        System.out.print("Open");
    }

}

public class Test {

    public static void main(String[] args) throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }
    }

}
