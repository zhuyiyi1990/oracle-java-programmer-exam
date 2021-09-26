package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 8);
//        A
        System.out.println(nums.stream().max(Comparator.comparing(a -> a)).get());
//        B
        System.out.println(nums.stream().max(Integer::max).get());
//        C
//        System.out.println(nums.stream().max());
//        D
//        System.out.println(nums.stream().map(a->a).max());
    }

}
