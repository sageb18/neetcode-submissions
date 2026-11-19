class Solution {
    public int maxProfit(int[] prices) {
        
        int topProfit = 0; // keeps track of highest profit
        int left = 0, right = 1;
        int maxRight = right;

        while (left < prices.length - 1) {
            
            while (right < prices.length) {
                if (prices[right] > prices[maxRight]) {
                    maxRight = right;
                }
                right++;
            }

            int newProfit = prices[maxRight] - prices[left];

            if (topProfit < newProfit) {
                topProfit = newProfit;
            }

            left++;
            right = left + 1;
            maxRight = right;

        }

        return topProfit;

    }
}
