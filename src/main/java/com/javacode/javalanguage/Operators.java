package com.javacode.javalanguage;


public class Operators {



    static  void bitwiseOperators(){
        byte op1 = 0b1001;
       byte res = op1;

       while (op1 == res){
           System.out.println("both op1 and res are equal");

           op1 = 0b1011;
           char c = 100;
           System.out.println(c);
       }
    }

    static void roundingAndCasting(){
        int i1 = 300;
        long l1 = (long)i1;
        l1 = i1;
        l1 = 200;
        i1 = (int)l1;

        double below=0.7, above=0.7;
        float belowf=0.7f, abovef=0.7f;
    }

    static void doExponent(){
        double de = 1.349e-43;
        Double le = 47e47;

        System.out.println("De"+de + "le"+le);
    }
    static void doDataAssignment(){
        byte b = 0xF;
        char c = 0xFFFF;
        Long l1 = 389999L;
        Long l2 = 3500000L;
        Long l3 = 388484499388384L;
        int x1 = 3774833;
        short s = 0xF;
        byte b1 = 0b10101;

        long longAmount = 7_000_000_000_000_000_000L;
        System.out.println("Long Amount:"+longAmount);
      //  System.out.println("b:" + Integer.toBinaryString(b));
    //    System.out.println("c:"+Integer.toBinaryString(c));
    }
    public static void main(String[] args) {
      //  doDataAssignment();
      //  doExponent();
        bitwiseOperators();
    }

}
