package com.javacode.generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Double> dOb;
        dOb = new Gen<Double>(95.98);
        dOb.showType();
        double v = dOb.getOb();

        System.out.println("The value of - iOb is %d%n "+v);


        NumericFns<Integer> nN1 = new NumericFns<Integer>(45);
        NumericFns<Double> dD1 = new NumericFns<Double>(45.00);

        System.out.println(nN1.absEqual(dD1));

//        Gen<String> sOb = new Gen<String>("Adams Apple");
//
//        sOb.showType();
//
//        System.out.println(" the value of sOb is "+sOb.getOb());
//
//        System.out.println("The Type of sOb "+sOb.getClass().getName()+" the value of i0b is: "+iOb.getClass().getName());
    }


}
