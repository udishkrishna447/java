class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int len = 0;

        for (int i = 1; i < prices.length; i++) {

            // Find a new minimum buying price
            if (prices[i] < min) {
                min = prices[i];
                len = i;
            }

            // Find profit from current price
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }

        return max;
    }
}