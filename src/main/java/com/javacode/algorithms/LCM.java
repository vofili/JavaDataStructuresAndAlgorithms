package com.javacode.algorithms;

public class LCM {
    public static void main(String[] args) {
       // System.out.println(bruteForceGetLCM(2,3));

        System.out.println(getLCM(4,5));
        System.out.println(getGreatestCommonDivisor(2,8));
    }

    //Euclidean LCM
    //Derive this by getting the greatest common divisor (GCD) of the twwo numbers.
    //Then divide their product by the GCD


    static int getLCM(int x , int y){
        if (x==y){
            return x;
        }
        int gcd = getGreatestCommonDivisor(x,y);

        return (x * y)/gcd;
    }


    //get GCD
    static int getGreatestCommonDivisor(int x, int y){

       var gcd = x > y ? y : x;
        while(gcd > 0 ){
            if(x % gcd == 0 && y % gcd == 0){
                return gcd;
            }
            --gcd;
        }
        return gcd;
    }

    static int bruteForceGetLCM(Integer x, Integer y){


        if(x > y && x % y == 0){
            return x;
        }else if (y > x && y % x == 0){
            return y;

        }else if(x % y != 0){
            return x * y;
        }
        return 1;
    }
}
