package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question43;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //A
//        Car auto = Car("MyCar")::new;
        //B
//        Car auto = Car::new;
        //C
        Rideable rider = Car::new;
        Car vehicle = rider.getCar("MyCar");
        //D
//        Car vehicle = Rideable::new::getCar("MyCar");
    }

}
