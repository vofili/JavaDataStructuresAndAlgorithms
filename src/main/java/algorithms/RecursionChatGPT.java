package algorithms;

public class RecursionChatGPT {



        // Recursive function to print numbers from 1 to 10
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

        public static void main(String[] args) {
            // Start the recursion with the first number
            printNumbers(1);
        }


}
