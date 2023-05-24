import java.util.HashMap;

class Solution {
    public int maxProfit(int[] prices) {
        short maxProfit = 0, minCost = (short)prices[0];

        for(int i = 1; i < prices.length; ++i)
            if(prices[i] < minCost) minCost = (short)prices[i];
            else maxProfit = (short)Math.max(maxProfit, prices[i] - minCost);

        return maxProfit;
    }
}