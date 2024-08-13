package com.javacode.functionaljava;

import java.util.Arrays;
import java.util.stream.*;
/**
 * Specifies Interrmediate operations that can be carried out on Streams
 */
public class IntermediateOps
{

    static int[] ages = {19, 34, 22, 10, 18 , 17, 50,  34,12,8, 17,22};

    public static void main(String[] args) {
        System.out.println(doStreamManualAverage());

        System.out.println(Arrays.toString(IntStream.of(ages)
                        .sorted().toArray()));
//        System.out.println(Arrays.toString(removeDuplicates()));

  //      System.out.println(Arrays.toString(IntStream.of(ages).limit(10).toArray()));
    }



    static int[] removeDuplicates(){
       return IntStream.of(ages).distinct().toArray();
    }
    //using map
    static int doMultipleAndSum(){
        return IntStream
                .rangeClosed(1,10)
                .map((x)->{ return x * 2;})
                .sum();
    }

    static double doStreamManualAverage(){
        return IntStream.rangeClosed(1,10)
                .average().getAsDouble();

    }
}
