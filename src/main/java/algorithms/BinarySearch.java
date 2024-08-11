package algorithms;

public class BinarySearch {

    //Binary search,
    // Split the input array into two and compare the target value with the middle value of the array
    // to ascertain which half the target value is in, then repeat until the target value is
    // found or return -1 if not found.
    static int doBinarySearch(int[] haystack, int needle){
        int upperlength = haystack.length;
        int lowerlength = 0;

        while(lowerlength < upperlength){
            int mid = Math.floorDiv(
                    upperlength+lowerlength,2);
            System.out.printf("upper %d, lower %d, mid %d%n",upperlength,lowerlength,mid);
            if(needle == haystack[mid]){

                return mid;
            }else if(needle < haystack[mid]){
                upperlength = mid - 1;
            }else if(needle > haystack[mid]){

                lowerlength = mid + 1;
            }else{
                return -1;
            }
            System.out.printf("upper %d, lower %d, mid %d%n",upperlength,lowerlength,mid);
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] hays={1,2,3,4,5,6};

        System.out.println(doBinarySearch(hays, 9));
    }
}
