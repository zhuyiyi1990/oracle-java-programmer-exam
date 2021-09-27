package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {

    String fName;

    String lName;

    public Emp(String fn, String ln) {
        fName = fn;
        lName = ln;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }

    public static void main(String[] args) {
        List<Emp> emp = Arrays.asList(new Emp("John", "Smith"), new Emp("Peter", "Sam"), new Emp("Thomas", "Wale"));
        System.out.println(emp.stream()
//        A
                .sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))
                .collect(Collectors.toList()));
    }

}
