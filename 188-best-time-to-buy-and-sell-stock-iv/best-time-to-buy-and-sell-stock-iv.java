class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int buy =  0;buy<=1;buy++){
                for(int cap=1;cap<=k;cap++){
                    if(buy==1){
                        int b = -prices[i]+dp[i+1][0][cap];
                        int nB = dp[i+1][1][cap];

                        dp[i][buy][cap] = Math.max(b,nB);
                    }
                    else{
                        int s = prices[i]+dp[i+1][1][cap-1];
                        int nS = dp[i+1][0][cap];

                        dp[i][buy][cap] = Math.max(s,nS);
                    }
                }
            }
        }
        return dp[0][1][k];
    }
}