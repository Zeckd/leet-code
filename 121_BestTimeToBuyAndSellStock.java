class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int best = 0;
        for (int price : prices) {
            minimum = Math.min(minimum, price);
            best = Math.max(best, price - minimum);
        }
        return best;
    }
}
