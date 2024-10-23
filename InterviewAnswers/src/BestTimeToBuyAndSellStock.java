public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};


        // SOLUTION Learning
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            System.out.printf("%d compares to %d", buyPrice, prices[i]);
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            System.out.println(" Profit is : " + (prices[i] - buyPrice));
            profit = Math.max(profit, prices[i] - buyPrice);
            System.out.println(profit);
            System.out.println(" Max Profit is : " + profit);
        }


        // Reverse Engineer Work
        // int currentSmallest = prices[0];
        // int smallestArrayIndex = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] < currentSmallest) {
        //         currentSmallest = prices[i];
        //         smallestArrayIndex = i;
        //     }
        // }
        // //System.out.println(currentSmallest); //FIND THE SMALLEST VAL AND ITS INDEX
        // //System.out.println(smallestArrayIndex);
        // if (smallestArrayIndex < prices.length - 1) {
        //     int currentMax = prices[smallestArrayIndex+1]-prices[smallestArrayIndex];
        //     for (int i =  smallestArrayIndex+1; i < prices.length; i++) {
        //         //System.out.printf("%d - %d = %d%n", prices[i], prices[smallestArrayIndex], prices[i]-prices[smallestArrayIndex]);
        //         int difference = prices[i]-prices[smallestArrayIndex];

        //         if (difference > currentMax) {
        //             currentMax = difference;
        //         }
        //     }
        //     System.out.println(currentMax);
        // } else {
        //     System.out.println(0);
        // }
    }
}
