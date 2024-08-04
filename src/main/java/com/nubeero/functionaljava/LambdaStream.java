package com.nubeero.functionaljava;


import java.security.SecureRandom;
import java.util.stream.*;

public class LambdaStream {


    //Intermediate Operations: filter, map, distinct, sorted, limit
    //Terminal Operations: sum, count,  average, reduce, min, max, forEach







    static Integer filterAndDouble(){


        Integer result;
        result = IntStream.rangeClosed(1,10)
                .filter((x) -> {return x % 2 ==0;})
                .map((x)-> {return x * 3;})
                .sum();
        return result;
    }
    static int doubleAndSum(){
            int sumEven = IntStream.rangeClosed(1,10)
                    .map((int x) -> {return x * 2;})
                    .sum();
return sumEven;
    }

    //implement sum, min, max, count, average, summaryStatistics, reduce functions on a stream
    static double calcAverage(int[]  ageArray){
        double res = 0.0;


        return res;
    }
    static int newSumLooper(int startValue,int endValue){
        int sum = 0;
        //i want a stream of int values in a particular range and need to perform an operation of sum on these values
        sum = IntStream.rangeClosed(startValue,endValue).sum();
        return sum;
    }

    static int oldSumLooper(int startValue, int endValue){
        int sum=0;
        for(int i = startValue; i <= endValue; i++){
            sum += i;

        }
        return sum;
    }

    static int showMapFilterProcessing(){
        Integer totalSum = IntStream.rangeClosed(1,10)
                .filter((x)->{
                    System.out.printf("filter %d%n",x);
                    return x % 2 == 0;
                })
                .map((x)->{
                    System.out.printf("map %d%n",x);
                    return x*3;

                }).sum();
        return totalSum;
    }

    static void secureRandom(){
        //pseudo random generator
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.ints(10,1,7).forEach(System.out::println);

      String oneliner = secureRandom.ints(10,1,6)
               .mapToObj(String::valueOf)
               .collect(Collectors.joining("-"));
        System.out.println(oneliner);
        //generate random integers and display all on same line
    }



    public static void main(String[] args) {

        String lno = String.valueOf(98);
        // System.out.println(newSumLooper(1,10));
        // System.out.println(doubleAndSum());
        // System.out.println(filterAndDouble());
        secureRandom();

        showMapFilterProcessing();
    }
}
