package com.javacode.generics;

public class GenericType<T> {
    T value;

    public GenericType(T o){
        this.value = o;
    }

    T getValue(){
        return this.value;
    }
    void showTypes(){
        System.out.println("The Type of Value in value is := "+this.value.getClass().getName());

    }
}
