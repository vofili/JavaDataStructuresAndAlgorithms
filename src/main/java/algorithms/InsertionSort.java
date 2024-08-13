package algorithms;
import java.util.Arrays;
import java.util.List;
/**
 * @author valenttine Ofili
 * Implement Insertion Sort algorithm for an array of integer values
 */
public class InsertionSort {




    public static void main(String[] args) {
        int[] testSort={20, 35, -15, 7, 55, 1 , -22,8};
        System.out.println(testSort.length
        );


        List<Integer> newList = Arrays.asList(4,2,19,38,9,3);
        for(Integer i:doIntIns(newList)){
     //       System.out.println(i);
        }
    }


    public static List<Integer> sortList(List<Integer> unsortedList) {
        for (int i = 0; i < unsortedList.size(); i++) {
            int current = i;
            // gets the smallest element and inserts at current index
            while (current > 0 && unsortedList.get(current) < unsortedList.get(current - 1)) {
                int temp = unsortedList.get(current);
                // swaps current smaller element with the element before it
                unsortedList.set(current, unsortedList.get(current - 1));
                unsortedList.set(current - 1, temp);
                current--;
            }
        }
        return unsortedList;
    }

    static List<Integer> doIntIns(List<Integer> unsorted){
        for(int i = 0;i < unsorted.size();i++){

            int currentIndex=i;
            while (currentIndex  > 0 && unsorted.get(currentIndex-1) > unsorted.get(currentIndex)){
               Integer temp = unsorted.get(currentIndex);

                unsorted.set(currentIndex,unsorted.get(currentIndex-1));
                unsorted.set(currentIndex-1,temp);
                currentIndex--;
            }
        }
        return unsorted;

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
