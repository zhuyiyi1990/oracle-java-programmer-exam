package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question30;

import java.util.Optional;

class Address {

    String city = "New York";

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }

}

public class Employee {

    Optional<Address> address;

    public Employee(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Address address = null;
        Optional<Address> addrs1 = Optional.ofNullable(address);
        Employee e1 = new Employee(addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
        System.out.println(eAddress);
    }

}
