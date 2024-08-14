package com.javacode.algorithms;


import java.util.*;
import java.util.Collections.*;
import java.util.stream.IntStream;

public class TestCoinChange {

    static List<Integer> coinChange(int[] coinSet, int coinAmount){

        //Greedy Algorithm
        //the denomination of coins are the coinset; the coin amount is given as coinAmount
        List<Integer> coinResult = new ArrayList<>();
        //{1,5,10,25} //65
        //Sort the coinSet in descending order that the maximum coin is always picked

        List<Integer> coinList = Arrays.stream(coinSet).boxed().toList();
       ArrayList<Integer> collCoinList = new ArrayList(coinList);
        Collections.reverse(collCoinList);

        for(int x = 0; x < collCoinList.size(); x++){
            while(coinAmount >= collCoinList.get(x)){
                coinAmount -= collCoinList.get(x);
                coinResult.add(collCoinList.get((x)));
            }
        }

        if(coinAmount != 0){
            return new ArrayList<>();
        }


      // List<Integer> cnSet = Arrays.asList(coinSet);

        return coinResult;
    }


  public static List<Integer> convertIntToIntegers(int[] array){
        return IntStream.of(array).boxed().toList();
  }

  static List<Integer> toIntegerArray(int[] array){
        return Arrays.stream(array).boxed().toList();
  }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25}; // Available coin denominations.
        int amount = 63; // The amount we need to make

        List<Integer> result = coinChange(coins, amount);

        if (result.isEmpty()) {
            System.out.println("Not possible to make the exact amount with the given coins.");
        } else {
            System.out.println("Coins used to make " + amount + " cents: " + result);
        }


        for(Integer x:convertIntToIntegers(coins)){
            System.out.println(x);
        }

        Iterator<Integer> iter = toIntegerArray(coins).iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
