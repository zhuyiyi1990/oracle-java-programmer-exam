package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question47;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));
        checkAge(iList, (Person p) -> {
            return p.getAge() > 40;
        });
        new Boolean(null);
    }

}
