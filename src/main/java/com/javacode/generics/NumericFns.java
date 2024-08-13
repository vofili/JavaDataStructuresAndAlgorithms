package com.javacode.generics;

import static java.lang.Math.abs;

public class NumericFns <T extends Number>{

    T num;

    public NumericFns(T n){

        this.num = n;
    }

    public T getNum() {
        return num;
    }

    boolean absEqual(NumericFns<?> n){
        return abs(this.num.doubleValue())==abs(n.getNum().doubleValue());
    }
}
