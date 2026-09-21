class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];


        }

        if(sum < Math.abs(target)){
            return 0;

        }

        if((sum + target)%2!=0) return 0;
        int k = (sum + target)/2;

        int[][] dp = new int[n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0] = 1;
        }
        if(nums[0] == 0){
            dp[0][0] = 2;
        }

        else if(nums[0]<=k){
            dp[0][nums[0]] = 1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<=k;j++){
                int nT = dp[i-1][j];
                int take = 0;
                if(nums[i]<=j){
                    take = dp[i-1][j-nums[i]];
                }

                dp[i][j] = take + nT;
            }
        }
        return dp[n-1][k];

    }
}