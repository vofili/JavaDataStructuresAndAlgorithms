package algorithms;

/**
 * @author valenttine Ofili
 * Implement Insertion Sort algorithm for an array of integer values
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] testSort={20, 35, -15, 7, 55, 1 , -22,8};
        for(int x: doSortAscending(testSort)){
            System.out.println(x);
        }
    }


    static int[] doSortAscending(int[] intArray){
        for(int firstUnsortedIndex = 1;firstUnsortedIndex < intArray.length;firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement;i--){
                intArray[i]=intArray[i-1];
            }

            intArray[i] = newElement ;
        }

        return intArray;
    }



    static int[] doInsertionSort(int[] array){
      //20, 35, -15, 7, 55, 1 , -22



        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;firstUnsortedIndex++){

            int newElement = array[firstUnsortedIndex];

            int x;
            for(x = firstUnsortedIndex; x > 0 && array[x-1] > newElement;x--){
                array[x]=array[x-1];
            }
            array[x]=newElement;

        }

        return array;
    }
}
