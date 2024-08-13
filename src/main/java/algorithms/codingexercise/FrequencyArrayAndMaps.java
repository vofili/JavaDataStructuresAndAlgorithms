package algorithms.codingexercise;

import java.util.*;

public class FrequencyArrayAndMaps {

//solve goldman sachs  frequency array question
    static void getBesttAverage(int[][] scores){

    }
    static void freqArray2(int[] inArray){
        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();

        for(int i=0;i < inArray.length;i++){

            if(myMap.containsKey(inArray[i])){
                    myMap.put(inArray[i],myMap.get(inArray[i])+1);
            }else{
                myMap.put(inArray[i],1);
            }

        }
        int[] keysArray=new int[myMap.size()];
        Set<Integer> set = new HashSet<Integer>();

    }
    static void frequencyArray(){
        int[] arr = new int[]{1, 2, 1, 3, 4, 2, 1};

        int maxItem=0;
        //find maximum value
        for(int x=1;x < arr.length; x++){
            if(arr[x-1] > arr[x]){
                maxItem=arr[x-1];
            }


        }
        System.out.printf("maximum value is %s%n",maxItem);
        int freqArray[]= new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                if(arr[j]==i){
                    freqArray[i]++;
                }
            }
        }
        for(int y=0;y < freqArray.length;y++){
            System.out.printf("Frequency: %d -  %d%n",y,freqArray[y]);
        }
    }

    //determine the pivot index of a given array
    static int getPivotIndex(int[] arr){
        arr = new int[]{2,4,6,8,10,10,20};
        int pivotResult = 0;
        int totalSum=0;
        for(int x:arr){
            totalSum += x;
        }
        System.out.println("the total sum is "+totalSum);
        int onePartSum=0;

        for(int a = 0; a < arr.length; a++){
            onePartSum = onePartSum + arr[a];
            int twoPartSum =0;
            for( int b = a+1; b < arr.length; b++){
                twoPartSum += arr[b];
            }
            System.out.println("the Two Part Sum is "+twoPartSum);
            System.out.println("the One Part Sum is "+onePartSum);
                if(onePartSum == twoPartSum){
                    pivotResult=a;
                    System.out.println("the Pivot Index is "+pivotResult);
                }
        }

        return pivotResult;
    }

    //remove duplicates from an array

    //sort elements in an array by selecting

    //sort elements in an array by insertion sort


    //try recursion



    public static void main(String[] args) {


          int[] arr = new int[]{2,4,6,8,20};
          getPivotIndex(arr);
        //frequencyArray();
        int[] newArray1 = new int[]{10,155,25,20,20,10,40,5,10,10};
        int[] newArray = new int[]{10,155,25,20,40,5};
        //freqArray2(newArray);
        Arrays.sort(newArray);
        for(int i = 1;i<newArray.length;i++){
            if(newArray[i-1]==newArray[i]){
                System.out.println("Array contains duplicates, hence not unique");
                break;
            }
        }
        System.out.println("Array contains unique items");


        HashMap<String,String> wmap=new HashMap<String,String>();
        wmap.put("England","Londinium");
        wmap.put("Germany","Berlin");
        wmap.put("Norway","Oslo");
        wmap.put("USA","wwashington");

        System.out.println(wmap);

        System.out.println(wmap.get("England"));
        System.out.println(wmap.get("USA"));

        System.out.println(wmap.remove("USA"));

        System.out.println(wmap);

        Map<String,String> liverpool =  new HashMap<String,String>();
        liverpool.put("L20","Bootle");
        liverpool.put("L3","City Center");
        liverpool.put("L13","Basel");

        System.out.println(liverpool.size());
        for(Map.Entry<String,String> i : liverpool.entrySet()){
            System.out.println(i);
        }
    }
}
