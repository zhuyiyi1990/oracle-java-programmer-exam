package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question13;

import java.io.File;

public class MyTest {

    public void recDelete(String dirName) {
        File[] listOfFiles = new File(dirName).listFiles();
        if (listOfFiles != null && listOfFiles.length > 0) {
            for (File aFile : listOfFiles) {
                if (aFile.isDirectory()) {
                    recDelete(aFile.getAbsolutePath());
                } else {
                    if (aFile.getName().endsWith(".class")) {
                        aFile.delete();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new MyTest().recDelete("D:\\temp\\test");
    }

}
