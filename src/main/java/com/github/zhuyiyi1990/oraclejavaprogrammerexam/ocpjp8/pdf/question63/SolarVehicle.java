package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question63;

public class SolarVehicle extends Vehicle {

    public void ride() throws Exception {
        super.ride();
    }

    public static void main(String[] args) throws FuelNotAvailException, Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }

}
