package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question108;

public class MyTest {

    public static void main(String[] args) {
        String color = "teal";
        switch (color) {
            case "Red":
                System.out.println("Found Red");
            case "Blue":
                System.out.println("Found Blue");
                break;
            case "Teal":
                System.out.println("Found Teal");
                break;
            default:
                System.out.println("Found Default");
        }
    }

}
