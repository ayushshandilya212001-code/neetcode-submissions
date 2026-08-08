class Solution {
    public int maxProfit(int[] prices) {
        int minPriceSoFar = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            int profitIfSoldToday = prices[i] - minPriceSoFar;
            maxProfit = Math.max(profitIfSoldToday,maxProfit);
            minPriceSoFar = Math.min(minPriceSoFar,prices[i]);
        }
        return maxProfit;
    }
}
