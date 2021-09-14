package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question61;

public interface Moveable<T> {

    public default void walk(T distance) {
        System.out.println("Walking");
    }

    public void run(T distance);

    public static void main(String[] args) {
        //A
        Moveable<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);
        //B
        /*Moveable<Integer> animal = n -> n + 10);
        animal.run(100);
        animal.walk(20);*/
        //C
        /*Moveable<Integer> animal = (Integer n) -> System.out.println(n);
        animal.run(100);
        Moveable.walk(20);*/
    }

}
