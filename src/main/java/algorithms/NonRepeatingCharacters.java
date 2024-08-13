package algorithms;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Valentine Ofili
 * @description write a method that returns the index of the first non-repeating character in a string
 * and returns -1 is there are no other repeating characters.
 */
public class NonRepeatingCharacters {


    public static void main(String[] args) {


        String tester ="geeksforgeeks";
       // System.out.println(bruteForceNonRepeat(tester));
        System.out.println(bruteForceNonRepeat(tester));

    }




    static int bruteForceNonRepeat(String rawString){
         int res = -1;
        boolean uniqueFlag=true;

        for(int i = 0;i < rawString.length();i++){


           for(int j = 0; j < rawString.length();j++) {
                if(rawString.charAt(i) == rawString.charAt(j) && j != i){
                    uniqueFlag=false;
                    break;
                }
                uniqueFlag=true;

            }
           if(uniqueFlag){
               res = i;
               return res;
           }

        }
        /*
        for(int i =0; i < strArray.length; i++){

             System.out.printf("Array Item %s is at position %d%n",strArray[i], i);
         }

         */

         return res;
    }


}
