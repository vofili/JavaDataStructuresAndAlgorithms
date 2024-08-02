package com.nubeero;

public class AlgorithmQuestions {

    static boolean checkIfPowerOfThree(Integer num){
        boolean isPowerOf3= true;


        while(num >= 3){
            num = num / 3;
            if( num % 3 != 0){
                isPowerOf3 = false;
                break;

            }
        }
        return isPowerOf3;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPowerOfThree(81));
    }
}
