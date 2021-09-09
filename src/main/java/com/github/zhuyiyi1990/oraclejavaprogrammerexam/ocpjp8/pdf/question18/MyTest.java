package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question18;

import java.io.InputStream;
import java.util.Properties;

public class MyTest {

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        InputStream in = MyTest.class.getClassLoader().getResourceAsStream("Message.properties");
        prop.load(in);
        System.out.println(prop.getProperty("welcome1"));
        System.out.println(prop.getProperty("welcome2", "Test"));
        System.out.println(prop.getProperty("welcome3"));
    }

}
