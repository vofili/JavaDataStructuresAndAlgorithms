package com.javacode.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class RomansToInteger {

    public static void main(String[] args) {
        String romans = "IX";

        doRomanToIntegerConvert(romans);
    }



    static int doRomanToIntegerConvert(String roman){
         Map<String,Integer> romMap=new HashMap<String,Integer>();
        romMap.put("I",1);
        romMap.put("V",5);
        romMap.put("X",10);
        romMap.put("L",50);
        romMap.put("C",100);
        romMap.put("D",500);
        romMap.put("M",1000);


        int total=0;

        String[] rom=roman.split("");
        for(int i = 0; i < rom.length;i++){

            if(i+1 < rom.length){
                int currentNum = romMap.get(rom[i]);
                int nextNum = romMap.get(rom[i+1]);
                if(currentNum >= nextNum){
                    total += currentNum;
                }else{
                    total += nextNum-currentNum;
                    i++;
                }
            }else{
                total += romMap.get(rom[i]);
            }

        }
        System.out.println(total);

        return total;
    }
}
