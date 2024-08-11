package com.nubeero.codingexercise;

public class DataStructuresFunctions {


        static int[] swapNumber(int[] inputArray, int indexOne,int indexTwo){
            int temp = inputArray[indexOne];
            inputArray[indexOne]=inputArray[indexTwo];
            inputArray[indexTwo]= temp;
            return inputArray;
        }

        static int[] selectionSort(){
             int[]sample = new int[]{20,35,-15,7,55,1,-22};

             int largestIndex=0;
             for(int i=sample.length-1;i > 0;i--){
                largestIndex = 0;
                for( int j = 0; j <= i; j++ ){
                    if (sample[j] > sample[largestIndex]){
                        largestIndex = j;
                    }
                }
                swapNumber(sample,largestIndex,i);
             }
        return sample;
        }

        static void removeDuplicatesFromArray(int[] arr){

        }

        public boolean isPlaindome(String word1, String word2){
               return false;
        }

        public static int linearSearch(int[] haystack, int needle){
            for (int x:haystack ){
                if(x == needle){
                    return needle;
                }
            }
            return 0;
        }

        //sort strings in alphabetical order
        public static void sortStrings(String[] sortme){
            for(int i = 0; i < sortme.length; i++){
                for(int j = 1; j  < sortme.length; j++){
                    if(sortme[j-1].compareTo(sortme[j]) > 0){
                        String temp=sortme[j-1];
                        sortme[j-1]=sortme[j];
                        sortme[j]=temp;
                    }
                }
            }
        }

        public static int binarySearch(int[] arr, int search){
            int low = 0;
            int high = arr.length;
            while (low < high){
                int mid = (high + low)/2;
                if(search < arr[mid]){
                    high = mid-1;
                }else if (search > arr[mid]){
                    low = mid+1;
                }else{
                    return  mid;
                }
            }

            return -1;
        }
    public static void main(String[] args) {

            int[] array = {1,2,-3,4,5,6,-7,8};

            String[] animals = {"zebra","cockroaches","flies","deer","ostritch","crow","1aadvark"};
            sortStrings(animals);
    for(String i:animals){
        System.out.println(i);
    }
    System.out.println(linearSearch(array,11));
            int[] sortedNumbers = {2,4,6,8,12,16,22,24,25,30};
            System.out.println(binarySearch(sortedNumbers,3));

    }
}
