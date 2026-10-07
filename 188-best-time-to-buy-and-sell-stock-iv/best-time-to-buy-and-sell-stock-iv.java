class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] ahead = new int[2][k+1];
        for(int i=n-1;i>=0;i--){
            int[][] curr = new int[2][k+1];
            for(int buy =  0;buy<=1;buy++){
                for(int cap=1;cap<=k;cap++){
                    if(buy==1){
                        int b = -prices[i]+ahead[0][cap];
                        int nB = ahead[1][cap];

                        curr[buy][cap] = Math.max(b,nB);
                    }
                    else{
                        int s = prices[i]+ahead[1][cap-1];
                        int nS = ahead[0][cap];

                        curr[buy][cap] = Math.max(s,nS);
                    }
                }
            }
            ahead = curr;
        }
        return ahead[1][k];
    }
}