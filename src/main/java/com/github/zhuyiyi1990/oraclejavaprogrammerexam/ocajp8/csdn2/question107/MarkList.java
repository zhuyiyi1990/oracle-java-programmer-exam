package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question107;

import java.util.ArrayList;

public class MarkList {

    int num;

    public static void graceMarks(MarkList obj4) {
        obj4.num += 10;
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
//        new obj3().graceMarks(obj2);
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            list.add("as");
        }
    }

}
