package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question76;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TechName {

    String techName;

    public TechName(String techName) {
        this.techName = techName;
    }

    public static void main(String[] args) {
        List<TechName> tech = Arrays.asList(new TechName("Java-"), new TechName("Oracle DB-"), new TechName("J2EE-"));
        Stream<TechName> stre = tech.stream();
        stre.map(a -> a.techName).forEach(System.out::print);
    }

}
