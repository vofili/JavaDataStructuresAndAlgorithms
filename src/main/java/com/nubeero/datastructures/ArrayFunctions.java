package com.nubeero.datastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayFunctions {



    static void returnArrayFromSet(Set<String> str){
        ArrayList<String> arr = new ArrayList<String>();
         for (String item :str){
             arr.add(item);
         }


    }
    static void removeDuplicates(String [] haystack){
        Set <String> resultSet = new HashSet<>();

        for(int x = 0;x < haystack.length;x++){
                resultSet.add(haystack[x]);

        }
        System.out.println(resultSet);
    }
    public static void main(String[] args) {

        String[] res ={"Antelope","Aadvark","Anvil","Antelope"};
        removeDuplicates(res);
        Set<String> str = new  HashSet<>();
    }
}
