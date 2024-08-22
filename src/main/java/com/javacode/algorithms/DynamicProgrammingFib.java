package com.javacode.algorithms;

public class DynamicProgrammingFib {



    static int countWays(int n,int[]dp){


        if(n<=1){
            return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= countWays(n-1,dp)+countWays(n-2,dp);
        return dp[n];
    }
    //return the nth number in the fibonacci series without using brute force approach
    static int fib(int n){
        //fib n = fib(n-1)+fib(n-2)
        if(n == 1){
            return 1;
        }if(n == 0){
            return 0;
        }
        return fib(n-1)+fib(n-2);
    }


    static int waystoreachnstairs(int n){
        return fib(n+1);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));

        int noofstairs=4;
        //the number of ways to reach n stairs is the f(n+1) number
        System.out.printf("Ways to climb %d Stairs is %d",noofstairs,waystoreachnstairs(noofstairs));
    }
}
