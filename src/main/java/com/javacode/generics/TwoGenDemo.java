package com.javacode.generics;

public class TwoGenDemo {


    static void runTwoGenDemo(){
        TwoGen<Integer,String> obj1 = new TwoGen<Integer,String>(1,"Bedouin Heart");
        TwoGen<Integer,String> obj2 = new TwoGen<Integer,String>(2,"People Parser");
        obj1.showType();
        obj2.showType();
    }

    public static void main(String[] args) {
        runTwoGenDemo();
    }
}
