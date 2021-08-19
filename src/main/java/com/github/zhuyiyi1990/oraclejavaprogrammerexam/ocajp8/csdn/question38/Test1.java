package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn.question38;

public class Test1 {

    private static char c;

    static void doubling(Integer ref, int pv) {
        ref = 20;
        pv = 20;
    }

    public static void main(String[] args) {
        Integer iObj = new Integer(10);
        int iVar = 10;
        doubling(iObj++, iVar++);
        System.out.println(iObj + ", " + iVar);
        System.out.println("c=" + c);
//        System.out.println("abc".substring(5));
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.insert(10, "a");
        System.out.println(sb.toString());
    }

}
