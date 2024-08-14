package com.javacode.generics;

public class GenMethodDemo {

    public static <T extends Comparable<T>, V extends Comparable<V>> boolean arrayEquals(T[] x,V[] y){
        if(x.length != y.length){
            return false;
        }

        for(int i =0;i < x.length;i++){
            if(!(x[i]).equals(y[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Integer num1[]= {1,2,3,4,5,6};
        Integer num2[] = {1,2,3,4,5,6};

        Double[] d1 = {1.0,2.0,3.0,4.0,5.0,6.0};

        System.out.println(arrayEquals(num1,num2));
        System.out.println(arrayEquals(num1,d1));
    }


    public <T> T myGen(T x){
        return x;
    }
}
