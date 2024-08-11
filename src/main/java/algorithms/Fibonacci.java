package algorithms;

/**
 * @author Valentine Ofili
 * @description solve for the nth fibonacci number using dynamic programming
 */
public class Fibonacci {


    public static void main(String[] args) {

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
       // System.out.println(getFibonacciNumber(15));
        //System.out.println(doRecursiveFibonacci(3));

      //  doRecursivePrint(1,10);

        printNumbers(10);

    }

    public static void printNumbers(int n) {
        // Base case: if n is greater than 10, stop the recursion
        if (n > 10) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call with the next number
        printNumbers(n + 1);
    }

    static void doRecursivePrint(int start,int end){
       if(start == end) {
           return;
       }else{
           System.out.println(start);
           doRecursivePrint(++start, end);
       }

    }




    static int doRecursiveFibonacci(int n){
        if(n == 0){

         return 0;
        }
        if(n == 1){

            return 1;
        }
        return doRecursiveFibonacci(n-2)+doRecursiveFibonacci(n-1);
    }
    static int getFibonacciNumber(int n){
        // base case for optimal solution is to find the  fibonacci number of N by calculating
        //the fibonacci number of f(n-1) + f(n-2)
        //the base case is that f(0) = 0 and f(1) = 1

        int[]fibArray = new int[n+1];
        fibArray[0]=0;

        fibArray[1]=1;
        for(int x = 2; x <= n; x++){
            fibArray[x] = fibArray[x-1]+ fibArray[x-2];
        }

        return fibArray[n];
    }

}
