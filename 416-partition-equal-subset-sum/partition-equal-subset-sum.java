class Solution {

    public boolean solve(int i,int k,int[] arr,int[][] dp){
        if(k == 0) return true;

        if(i==0) return arr[0] == k;

        if(dp[i][k]!=-1){
            return dp[i][k] == 1;
        }

        boolean nT = solve(i-1,k,arr,dp);

        boolean take = false;
        if(arr[i]<=k){
            take = solve(i-1,k - arr[i],arr,dp);
        }

        boolean ans = take || nT;

        dp[i][k] = ans ? 1: 0;

        return ans;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }

        if(sum % 2!=0){
            return false;
        }

        int target = sum / 2;

        int[][] dp = new int[n][target + 1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(n-1,target,nums,dp);
    }
}