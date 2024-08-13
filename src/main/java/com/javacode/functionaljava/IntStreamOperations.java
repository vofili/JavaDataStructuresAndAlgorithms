package com.javacode.functionaljava;

import java.util.stream.*;

public class IntStreamOperations {


    static void doIntStreamOps(){
        int arr[] = {2,5,6,9,18,9,5,3,2,1,6,4,2,4,9,1};

        System.out.println("Original Values:");
        System.out.println(IntStream.of(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "))
        );

        //remove duplicates
        Integer oneSum = IntStream.of(arr).sum();

        System.out.println("Sum of Integer stream:"+oneSum);

        System.out.println("Minimum: "+ IntStream.of(arr).min().getAsInt());
        System.out.println("Maximum: "+IntStream.of(arr).max().getAsInt());
        System.out.println("Average: "+IntStream.of(arr).average().getAsDouble());

        //sum total of values with the reduce operation
       Integer sumTot = IntStream.of(arr)
                .reduce(1,(x,y)->{
                    return x + y;
                });
        System.out.println("Sum Total: "+sumTot);
        //product of all values with the reduce operation
        Integer prod = IntStream.of(arr)
                .reduce((x,y)-> x * y)
                .getAsInt();
        System.out.println("Multiplication: "+prod);

        //sort the elements of the stream

        System.out.println("Sorted List: "+IntStream.of(arr)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));


        //filter out all the odd numbers

        //print out all prime numbers in the stream



    }


    public static void main(String[] args) {
        doIntStreamOps();
    }

}
