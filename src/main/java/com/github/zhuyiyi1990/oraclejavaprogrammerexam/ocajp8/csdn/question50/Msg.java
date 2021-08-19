package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn.question50;

public class Msg {

    public static String doMsg(char x) {
        return "Good Day!";
    }

    public static String doMsg(int y) {
        return "Good Luck!";
    }

    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(x);
        System.out.println(z);
        System.out.println(doMsg(x));
        System.out.println(doMsg(z));
        System.out.println("abc".substring(1, 12));
    }

}
