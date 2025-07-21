package arrays;

public class buyandsell {
    public static int[] maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return new int[]{0, 0, 0};

        int minPrice = prices[0];
        int maxProfit = 0;
        int buyPrice = prices[0];
        int sellPrice = prices[0];

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
                buyPrice = minPrice;
                sellPrice = price;
            }
        }

        return new int[]{maxProfit, buyPrice, sellPrice};
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example stock prices by day
        int[] result = maxProfit(prices); // Call the function

        System.out.println("Maximum Profit: " + result[0]);
        System.out.println("Buy Price (Minimum): " + result[1]);
        System.out.println("Sell Price (Maximum after buying): " + result[2]);
    }
}
