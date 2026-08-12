class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int p =  prices.length;
        int d = discounts.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = p - 1;
        int j = d - 1;
        double ans = 0;

        while(j>=0 && i>=0){
            ans += (prices[i] * (double)(100-discounts[j]))/100;
            j--;
            i--;
        
        
        }

        while(i>=0){
            ans += prices[i];
            i--;
        }

        return ans;
    }
}