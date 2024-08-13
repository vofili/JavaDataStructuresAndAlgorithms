package com.nubeero.functionaljava;
import java.util.stream.IntStream;
import java.util.Arrays;

public class IntStreamOps {
    public static void main(String[] args) {

            int[] classScores = {20,30,31,40,50,52,57,60,62,65,70,75,80};

            int[] studentScores = {100, 98, 95, 87,20,57,60,62,65,30,31,40,50,52,70,75,80};
//Test IntStream Filter Operation
//            for( int y: doIntStreamFilter(classScores)){
//                System.out.println(y);
//            }

        System.out.println(doIntStreamSumWithReduce(studentScores
        ));


        //Test IntStream Sort Operation
            for(int i: doIntStreamSort(studentScores)){
                System.out.println("i:- "+i);
            }

            int lowest = getMinimumScore(classScores);
        System.out.printf("Class Scores Total with IntStream Sum() %d%n",doIntStreamAdd(classScores));
            System.out.println(lowest);

        System.out.printf("Class Scores Total with IntStream Reduce() %d%n",doIntSumWithReduce(classScores));
    }



    static int doIntStreamSumWithReduce(int[] array){
        return IntStream.of(array).reduce(0,(x,y)-> x + y);

    }

    static int[] doIntStreamFilter(int[] arr){
        return IntStream.of(arr).filter((x)-> x >= 50)
                .toArray();
    }

    static int[] doIntStreamSort(int[] arr){
        return IntStream.of(arr).sorted()
                .toArray();
    }
    static int doIntSumWithReduce(int[] array){
        return IntStream.of(array).reduce(0,(x,y)->x+y);
    }

    static int doIntStreamAdd(int [] array){
        return IntStream.of(array).sum();

    }
    static double doIntStreamAvg(int x){
        return IntStream.rangeClosed(1,x).average().orElse(0.0D);
    }
    static int getMinimumScore(int array[]){
        return Arrays.stream(array).min().orElse(0);
    }
    static double doIntStreamCount(int x){
       return IntStream.rangeClosed(1,x).count();

    }
}
