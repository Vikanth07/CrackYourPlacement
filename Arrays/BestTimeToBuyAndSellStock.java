package Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int maxRight = prices[n-1];
        for(int i=n-2; i>=0; i--){
            maxRight = Math.max(maxRight, prices[i]);
            maxProfit = Math.max(maxProfit, maxRight-prices[i]);
        }
        return maxProfit;
    }
}
