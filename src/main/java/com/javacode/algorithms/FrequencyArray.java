package com.javacode.algorithms;

import java.util.HashMap;
/**
 * This class shows how the Frequency Array data structure is used to print out the number of
 * occurrences of the items in the array
 * @author Valentine Ofili
 * @author www.valsdevspace.io
 * @since 1.0
 */
/**
 {@summary
    Given an array of integers find the number of occurrences of the items in the array
    by printing out the frequency of each item as a dictionary
    b. Provide an implementation that returns a frequency of occurrence of each item for a string array
    c. immplement a program that returns the best average score given an array of scores tied to names of students}
*/

public class FrequencyArray {


    static HashMap<Integer,Integer> numberFrequencyArray(int[] arrayData){
            HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
            for(int x = 0; x < arrayData.length;x++){
                if(myMap.containsKey(arrayData[x])){
                    myMap.put(arrayData[x],myMap.get(arrayData[x])+1);
                }else{
                    myMap.put(arrayData[x],1);
                }
            }
            return myMap;

    }

//    static HashMap<String,ScoreDetails> stringFrequencyArray(Score[] words){
//        HashMap<String,ScoreDetails> myMap = new HashMap<String,ScoreDetails>();
//        for( int i = 0; i < words.length; i++){
//            if(myMap.containsKey(words[i].getName())){
//                myMap.put(words[i].getName(),new ScoreDetails();
//
//            }else{
//
//                ScoreDetails scDet = new ScoreDetails();
//                scDet.setScoreTotal(words[i].getScoreValue());
//                scDet.setScoreCount(1);
//                myMap.put(words[i].getName(),scDet);
//
//
//                );
//            }
//        }
//        return myMap;
//    }


    public static void main(String[] args) {

        int[] myArray={2,5,3,1,8,4,9,1,5,2,3,8,7,0,1,6,5,2,3,9,0,1,7,8,4};

        Score[] scoreList = {new Score("Charles",40), new Score("Alice",55),
                new Score("Benson",90),
        new Score("Fred",75),new Score("Matthew",65),new Score("Prosper",45),
        new Score("Charles",76),new Score("Prosper",90),new Score("Fred",35)};


        System.out.println(numberFrequencyArray(myArray));
    }
}
class Score{
    String name;
    Integer scoreValue;

    public Score(String name,Integer scoreValue){
        this.scoreValue = scoreValue;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(Integer scoreValue) {
        this.scoreValue = scoreValue;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", scoreValue=" + scoreValue +
                '}';
    }
}

class ScoreDetails{
    Integer scoreTotal;
    Integer scoreCount;


    public Integer getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(Integer scoreTotal) {
        this.scoreTotal = scoreTotal;
    }

    public Integer getScoreCount() {
        return scoreCount;
    }

    public void setScoreCount(Integer scoreAverage) {
        this.scoreCount = scoreAverage;
    }
}