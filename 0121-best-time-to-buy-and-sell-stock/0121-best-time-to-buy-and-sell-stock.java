class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0, prev = Integer.MAX_VALUE, diff = 0;

        for(int i = 0; i < prices.length; i++ ){
            if(prices[i] < prev){
                prev = prices[i];
            }
            diff = prices[i] - prev;
            if(diff > maxProf){
                maxProf = diff;
            }
        }
        return maxProf;
    }
}