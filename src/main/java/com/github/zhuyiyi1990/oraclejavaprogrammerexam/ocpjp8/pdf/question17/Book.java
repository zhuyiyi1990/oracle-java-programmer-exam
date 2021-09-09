package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question17;

public class Book {

    int id;

    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean output = false;
        Book b = (Book) obj;
        if (this.name.equals(b.name)) {
            output = true;
        }
        return output;
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programing");
        Book b2 = new Book(102, "Java Programing");
        System.out.println(b1.equals(b2));
    }

}
