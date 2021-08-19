package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question154;

public class TestLoop {

    public static void main(String[] args) {
        float myArray[] = {10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;
        //insert code here
        //A
        /*while (key == myArray[index++]) {
            isFound = true;
        }*/
        //B
        /*while (index <= 4) {
            if (key == myArray[index]) {
                index++;
                isFound = true;
                break;
            }
        }*/
        //C
        while (index++ < 3) {
            System.out.println(index);
            if (key == myArray[index]) {
                isFound = true;
            }
        }
        System.out.println(isFound);
    }

}
