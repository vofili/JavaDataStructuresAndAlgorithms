package com.nubeero.functionaljava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StringStreams {


    static void sortStreams(){
        String[] strArr = {"red","blue","zen","white","green","orange","purple"};
        System.out.println(Arrays.asList(strArr));

        List<String> ordColors = Arrays.asList(strArr).stream().sorted().collect(Collectors.toList());
        System.out.println(ordColors);
     }

    public static void main(String[] args) {
        sortStreams();
    }
}
