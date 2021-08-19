package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question103;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        List<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(2);
        points.remove(null);
        System.out.println(points);
        try{

        }catch (Error e){

        }
    }

}
