package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** @author Valentine
 * @description Use Greedy algoritthmm to solve the coin change problem
 * find the minimum number of coins required to return the correct change
 */
public class CoinChange {


    static Integer[] getCoinChange(int[] denominations, double amount){
        List<Integer> result = new ArrayList<>();

        Arrays.sort(denominations);
       // System.out.println(Arrays.toString(denominations));
        for(int x = denominations.length-1;x >= 0; x--){
            while(amount >= denominations[x]){
                amount = amount - denominations[x];
                result.add(denominations[x]);
            }
        }
        if(amount < 0){
            result = new ArrayList<>();
        }

        return result.toArray(new Integer[0]);
    }

    public static int[] calculatePacks(int orderQuantity, Pack[] packSizes) {
        int[] packs = new int[packSizes.length];

        for (int i = packSizes.length - 1; i >= 0; i--) {
            packs[i] = orderQuantity / packSizes[i].getSize();

            System.out.printf("1:: Pack %d Order Qty %d PackSize %d%n",i,orderQuantity,packSizes[i].getSize());
            orderQuantity %= packSizes[i].getSize();
            System.out.printf("2:: Pack Order Qty %d PackSize %d%n",orderQuantity,packSizes[i].getSize());
        }

        return packs;
    }


    public static void main(String[] args) {
        int[] coins1={25,10,5,1};


        System.out.println(Arrays.toString(getCoinChange(coins1,63)));

        int[] coins2={4,3,1};

        System.out.println(Arrays.toString(getCoinChange(coins2,20)));


        Pack[] packSizes = {
                new Pack(5000),
                new Pack(2000),
                new Pack(1000),
                new Pack(500),
                new Pack(250)
        };

        int orderQuantity = 12000;
        int[] packs = calculatePacks(orderQuantity, packSizes);

        System.out.println(Arrays.toString(packs));

    }
}
class Pack{
    int size;

    public Pack(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}