class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int j=0;j<=amount;j++){
            if(j%coins[0]==0){
                dp[0][j] = j/coins[0];
            }
            else{
                dp[0][j] = 1000000;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int nT = dp[i-1][j];

                int take = 1000000;
                if(coins[i]<=j){
                    take = 1+dp[i][j-coins[i]];
                }
                dp[i][j] = Math.min(take,nT);
            }
        }
        if(dp[n-1][amount]>=1000000){
            return -1;
        }
        return dp[n-1][amount];
    }
}