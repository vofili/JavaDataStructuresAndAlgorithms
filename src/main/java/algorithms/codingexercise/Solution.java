package algorithms.codingexercise;

public class Solution {

    public int solution(int[] A) {
        int N = A.length;
        int[] dp = new int[N];
        dp[0] = A[0];

        for (int i = 1; i < N; i++) {
            int max = dp[i-1]; // Initialize max with the value from the previous cell
            for (int dice = 2; dice <= 6; dice++) {
                if (i - dice >= 0) {
                    max = Math.max(max, dp[i - dice]);
                }
            }
            dp[i] = max + A[i];
        }

        return dp[N-1];
    }

    public static void main(String[] args) {
        Solution dp = new Solution();
        int[] A = {1, -2, 0, 9, -1, -2};
        System.out.println(dp.solution(A));  // Output should be 8
    }
}
