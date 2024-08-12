package algorithms;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] test = {77, 71,4 ,99, 0, 2, 76};
        //System.out.println(Arrays.toString(selectionSort(test)));

        Arrays.toString(selectionSort(test));
    }

        public static int[] selectionSort(int[]array){
            //22, 71,4 ,99, 0, 2, 76

            for(int i = array.length-1; i > 0;i--){
              int largestIndex=0;
                System.out.println("before swap: "+Arrays.toString(array)+ " Largest Index: "+largestIndex);
              for(int j = 1; j <= i;j++){
                  if(array[largestIndex] < array[j]){
                      largestIndex = j;
                  }
              }
              int temp = array[i];

              array[i]=array[largestIndex];
              array[largestIndex]=temp;

                System.out.println("after swap: "+Arrays.toString(array)+ " Largest Index: "+largestIndex);
            }
            return array;
        }


}
