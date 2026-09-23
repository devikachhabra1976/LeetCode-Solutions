class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        int[] dp1= new int[n];
        int[] dp2 = new int[n];
       
        for(int i=0;i<=n-2;i++){
            arr1[i] = nums[i];
        }
        for(int i=1;i<n;i++){
            arr2[i-1] =  nums[i];
        }
        dp1[0] = 0;
        dp1[1] = arr1[0];
        for(int i=2;i<n;i++){
         int left = arr1[i-1]+dp1[i-2];
        int right = dp1[i-1];
         dp1[i] = Math.max(left,right);
        }
           dp2[0] = 0;
        dp2[1] = arr2[0];
        for(int i=2;i<n;i++){
         int left = arr2[i-1]+dp2[i-2];
        int right = dp2[i-1];
         dp2[i] = Math.max(left,right);
        }
        return Math.max(dp1[n-1],dp2[n-1]);
        
    }
}