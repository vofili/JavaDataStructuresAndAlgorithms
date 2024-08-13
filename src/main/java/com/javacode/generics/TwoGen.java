package com.javacode.generics;

public class TwoGen<K,V>{
    K key;
    V value;
    public TwoGen(K k, V v){

        this.key = k;
        this.value = v;
    }

    void showType(){
        System.out.printf("The Type of the Key is %s%n",this.key.getClass().getName());
        System.out.printf("The Type of the Value is %s%n",this.value.getClass().getName());
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
