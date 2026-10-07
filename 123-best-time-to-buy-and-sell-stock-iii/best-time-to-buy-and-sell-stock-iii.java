class Solution {
    public int solve(int i,int buy,int cap,int[] prices,int[][][] dp){
        if(cap == 0) return 0;
        if(i== prices.length) return 0;
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        int profit;

        if(buy == 1){
            profit = Math.max(-prices[i]+solve(i+1,0,cap,prices,dp),solve(i+1,1,cap,prices,dp));
        }
        else{
            profit =  dp[i][buy][cap]=Math.max(prices[i]+solve(i+1,1,cap-1,prices,dp),solve(i+1,0,cap,prices,dp));
        }

        dp[i][buy][cap] = profit;

        return dp[i][buy][cap];
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
            Arrays.fill(dp[i][j],-1);
            }

        }
        return solve(0,1,2,prices,dp);
    }
}