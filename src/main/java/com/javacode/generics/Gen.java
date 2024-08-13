package com.javacode.generics;

import java.lang.Math.*;

import static java.lang.Math.abs;

class Gen <T extends Number>{

    T ob;

    public Gen(T o){
        this.ob = o;
    }
    T getOb(){
        return this.ob;
    }

    double getReciprocal(){
        return 1 / this.ob.doubleValue();
    }

    double getFractionalComponent(){
        return abs(this.ob.intValue() - this.ob.doubleValue());
    }

    void showType(){
        System.out.printf("Type of T is %s%n",this.ob.getClass().getName());
    }
}
