class Solution {
    public int solve(int i,int[] nums,int[] dp){
        if(i<=0) return 0;
        if(dp[i]!=-1) return dp[i];
        int left = nums[i-1]+solve(i-2,nums,dp);
        int right = solve(i-1,nums,dp);
        return dp[i] = Math.max(left,right);
       
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        int[] dp1= new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        for(int i=0;i<=n-2;i++){
            arr1[i] = nums[i];
        }
        for(int i=1;i<n;i++){
            arr2[i-1] =  nums[i];
        }
        int res = solve(n-1,arr1,dp1);
        int res2 = solve(n-1,arr2,dp2);
        return Math.max(res,res2);
        
    }
}