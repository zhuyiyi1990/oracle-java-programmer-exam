package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question104;

class MissingInfoException extends Exception {

}

class AgeOutOfRangeException extends Exception {

}

class Candidate {

    String name;

    int age;

    public Candidate(String name, int age) throws Exception {
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutOfRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return name + " age: " + age;
    }

}

public class Test {

    public static void main(String[] args) throws Exception {
        Candidate c = new Candidate("James", 20);
        Candidate c1 = new Candidate("Williams", 32);
        System.out.println(c);
        System.out.println(c1);
    }

}
