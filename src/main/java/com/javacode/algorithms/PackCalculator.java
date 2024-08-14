package com.javacode.algorithms;


import java.util.HashMap;
import java.util.Map;

public class PackCalculator {

    // Define the available pack sizes in descending order
    private static final int[] PACK_SIZES = {5000, 2000, 1000, 500, 250};

    public static Map<Integer, Integer> calculatePacks(int itemsOrdered) {
        Map<Integer, Integer> packs = new HashMap<>();

        // Loop through each pack size starting from the largest
        for (int packSize : PACK_SIZES) {
            // Determine how many packs of the current size are needed
            int numberOfPacks = itemsOrdered / packSize;
            if (numberOfPacks > 0) {
                packs.put(packSize, numberOfPacks);
                // Reduce the remaining number of items to be fulfilled
                itemsOrdered -= numberOfPacks * packSize;
            }
        }

        // If itemsOrdered is still greater than 0, we need an additional smallest pack
        if (itemsOrdered > 0) {
            packs.put(250, packs.getOrDefault(250, 0) + 1);
        }

        return packs;
    }

    public static void main(String[] args) {
        int[] testOrders = {1, 250, 251, 501, 12001,12000};

        for (int order : testOrders) {
            System.out.println("Order: " + order + " items");
            Map<Integer, Integer> result = calculatePacks(order);
            result.forEach((packSize, count) ->
                    System.out.println("Pack Size: " + packSize + ", Count: " + count));
            System.out.println();
        }
    }
}
