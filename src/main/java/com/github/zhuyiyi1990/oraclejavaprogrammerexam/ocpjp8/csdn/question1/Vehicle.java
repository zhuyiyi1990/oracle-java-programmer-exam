package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.csdn.question1;

public class Vehicle {

    int distance;

    Vehicle(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) {
        int timeTravel = time;
        class Car {
            int value = 0;

            public void speed() {
                value = distance / timeTravel;
                System.out.println("Velocity with new speed " + value + " kmph");
            }
        }
        new Car().speed();
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(100);
        v.increSpeed(60);
    }

}
