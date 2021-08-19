package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question156;

public class Whizlabs {

    public static void main(String[] args) {
        String s = "c";
        Double d = Double.valueOf("120D");
        System.out.println(d);
        switch (s) {
            case "a":
                System.out.println("simple A");
            default:
                System.out.println("default");
            case "A":
                System.out.println("Capital A");
        }
    }

}
