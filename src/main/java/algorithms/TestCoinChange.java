package algorithms;


import java.util.ArrayList;
import java.util.List;

public class TestCoinChange {

    public static List<Integer> coinChange(int[] coins, int amount) {
        List<Integer> result = new ArrayList<>();

        // Sort the coins array in descending order
        java.util.Arrays.sort(coins);

        // Iterate through the coins array from largest to smallest
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                result.add(coins[i]);
            }
        }

        // If we cannot make the exact amount, return an empty list
        if (amount > 0) {
            return new ArrayList<>(); // Not possible to make the exact amount
        }

        return result;
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25}; // Available coin denominations
        int amount = 63; // The amount we need to make

        List<Integer> result = coinChange(coins, amount);

        if (result.isEmpty()) {
            System.out.println("Not possible to make the exact amount with the given coins.");
        } else {
            System.out.println("Coins used to make " + amount + " cents: " + result);
        }
    }
}
