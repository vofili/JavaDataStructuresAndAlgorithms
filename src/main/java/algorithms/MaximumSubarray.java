package algorithms;

public class MaximumSubarray {


    public static int bruteForceSolution(int[] A) {

      //  Loop through All Possible Starting Points (P):
      //  Use an outer loop to set the starting point P of the slice.//Loop through All Possible Ending Points (Q):
      //  Use an inner loop to set the ending point Q of the slice, where Q must be greater than or equal to P.
      // Calculate the Sum of Each Slice:
      //  For each pair (P, Q), compute the sum of the slice A[P] + A[P+1] + ... + A[Q].
      //          Track the Maximum Sum:


        int N = A.length;
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value

        // Outer loop for the starting point P
        for (int P = 0; P < N; P++) {
            int currentSum = 0; // Reset the current sum for the new starting point

            // Inner loop for the ending point Q
            for (int Q = P; Q < N; Q++) {
                // Add A[Q] to the current sum to include the current element in the slice
                currentSum += A[Q];
                //System.out.println(currentSum);
                // Update maxSum if currentSum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }




    public static int moreEfficientApproach(int[] A){

                // Initialize variables
                int maxEndingHere = A[0];
                int maxSoFar = A[0];

                // Traverse the array starting from the second element
                for (int i = 1; i < A.length; i++) {
                    // Update maxEndingHere with the maximum of current element alone or extending the existing slice
                    maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);

                    // Update maxSoFar with the maximum slice sum found so far
                    maxSoFar = Math.max(maxSoFar, maxEndingHere);
                }

                return maxSoFar;
            }





    public static void main(String[] args) {

       int[] arr = {3, 2, -6, 4, 0};

       System.out.println(bruteForceSolution(arr));

        System.out.println(moreEfficientApproach(arr));
    }
}
