package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question127;

public class Case {

    public static void main(String[] args) {
        String product = "Pen";
        product.toLowerCase();
        product.concat(" BOX".toLowerCase());
        System.out.print(product.substring(4, 6));
    }

}
