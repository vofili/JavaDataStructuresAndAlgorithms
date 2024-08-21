package com.javacode.datastructures.strings;

public class StringOps {


    public static void main(String[] args) {
        String myname = "i love programming very much";


        System.out.println(reverseCharactersInString(myname));

        System.out.println(reverseWords(myname));
    }

    static String reverseWords(String word){
        String res="";
        String[]words=word.split(" ");
        for(int i = words.length-1;i>=0;i--){
            res = res+words[i]+" ";
        }
        return res;
    }
    static String reverseCharactersInString(String s){

        String[] sArray = s.split("");
        String res="";
        for(int i = sArray.length-1; i >=0; i--){

            res = res + sArray[i];

        }

        return res;
    }
}
