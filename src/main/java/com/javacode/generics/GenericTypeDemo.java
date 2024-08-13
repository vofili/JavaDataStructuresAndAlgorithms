package com.javacode.generics;

public class GenericTypeDemo {

    public static void main(String[] args) {
        GenericType<String> strType = new GenericType<String>("Valentine Ofili");
        GenericType<Integer> intType = new GenericType<Integer>(256);
        System.out.println(strType.getValue()
        );
        strType.showTypes();
        System.out.println(intType.getValue());
        intType.showTypes();

    }
}
