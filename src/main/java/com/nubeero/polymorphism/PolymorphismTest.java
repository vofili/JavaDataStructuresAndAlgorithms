package com.nubeero.polymorphism;

public class PolymorphismTest {

    public static void main(String[] args) {
        CommissionEmployee commEmp = new CommissionEmployee("Benson", "Chase","7747-198222",0.05,14500);
        //commEmp.earnings();
        System.out.println(commEmp.toString());
    BasePlusCommissionEmployee basePlusEmp = new BasePlusCommissionEmployee("Charles","Bankschweizer","452248-388",0.02,19920,2000);
        System.out.println(basePlusEmp.toString());

        CommissionEmployee commEmp2 = basePlusEmp;

        System.out.println(commEmp2.toString());
    }
}
