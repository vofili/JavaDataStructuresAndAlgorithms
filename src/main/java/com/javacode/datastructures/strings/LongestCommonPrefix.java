package com.javacode.datastructures.strings;
import java.util.Arrays;

public class LongestCommonPrefix {


    //longest common prefix
    /**
     * Input: strs[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
     * Output: gee
     * Explanation: “gee” is the longest common prefix in all the given strings.
     */

    static String getLongestCommonPrefix(String[] inputArray){
        //sort the inputArray in order from the Smallest to Largest

        Arrays.sort(inputArray);

        StringBuilder commonSubString=new StringBuilder("");
        int n=0;
        String minWord=inputArray[0];
        String maxWord=inputArray[inputArray.length-1];

        while(n < minWord.length() && minWord.charAt(n)==maxWord.charAt(n)){

            n++;
        }
        return inputArray[0].substring(0,n);
    }

    public static void main(String[] args) {
            String[] str = {"geekst","geekseer","geek","geeks","geekzer"};

        System.out.println(getLongestCommonPrefix(str));


        String myName ="VALENTINE";

        System.out.println(myName.substring(0,5));
    }
}
