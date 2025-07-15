public class BuySellStock {

    public static void buySellStock1(int[] prices){
        System.out.println("************ Buy and Sell Stock Approach 1 ************");
        if (prices == null || prices.length < 2) {
            System.out.println("Not enough data to calculate profit.");
            return;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // If we find a lower price, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Check the profit if we sell at current price
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println("Max Profit: " + maxProfit);
    }

    public static void buySellStock2(int[] prices){

        System.out.println("*********** Buy Sell Stock Approach 2 ************");
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices){
            if (price < minPrice){
                minPrice = price;
            } else if ((price - minPrice) > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        System.out.println("Max Profit: " +maxProfit);
    }
    public static void main(String[] args) {


        int[] prices = {5,2,7,8,10,3,1};
        buySellStock1(prices);
        buySellStock2(prices);

    }
}
