class Solution {
    public int solve(int i,int amount,int[] coins,int[][] dp){
        if(i==0){
            if(amount % coins[i] == 0){
                return amount/coins[i];
            }
            else{
                return 1000000;
            }
        }

        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }

        int nT = solve(i-1,amount,coins,dp);

        int take = 1000000;
        if(coins[i]<=amount){
            take = 1+solve(i,amount-coins[i],coins,dp);

        }

        dp[i][amount] = Math.min(take,nT);
        return dp[i][amount];
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(n-1,amount,coins,dp);

        if(ans >= 1000000){
            return -1;
        }
        return ans;
    }
}