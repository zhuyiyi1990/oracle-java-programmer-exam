package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question10;

public class Foo<K, V> {

    private K key;

    private V value;

    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo<T, T> twice(T value) {
        return new Foo<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Foo<String, Integer> mark = new Foo<>("Steve", 100);
        Foo<String, String> pair = Foo.<String>twice("Hello World!");
        Foo<?, ?> percentage = new Foo<>(97, 32);
        Foo<String, String> grade = new Foo<>("John", "A");
    }

}
