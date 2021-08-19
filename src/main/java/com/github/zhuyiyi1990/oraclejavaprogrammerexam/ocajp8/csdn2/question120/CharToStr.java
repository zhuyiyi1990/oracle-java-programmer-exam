package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question120;

public class CharToStr {

    public static void main(String[] args) {
        String str1 = "Java";
        char[] str2 = {'J', 'a', 'v', 'a'};
        String str3 = null;
        for (char c : str2) {
            str3 = str3 + c;
        }
        System.out.println("str3=" + str3);
        if (str1.equals(str3)) {
            System.out.print("Successful");
        } else {
            System.out.print("Unsuccessful");
        }
        int[][] arr = new int[2][];
        try {
            arr.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
