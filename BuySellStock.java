public class BuySellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = 1;
        int len = prices.length;
        while(right < len){
            if(prices[right] - prices[left] > 0)
                max = Math.max(max, prices[right] - prices[left]);
            else
                left = right;

            right++;
        }
        return max;
    }
}
