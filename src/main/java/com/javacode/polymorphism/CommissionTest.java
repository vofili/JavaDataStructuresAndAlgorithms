package com.javacode.polymorphism;

public class CommissionTest {

    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Susan","Joseph","444-232-15555",1500.00,0.10);
        System.out.println(commissionEmployee.toString());
    }
}
