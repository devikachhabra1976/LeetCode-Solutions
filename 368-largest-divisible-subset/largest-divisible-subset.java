class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            parent[i] = i;
            for(int prev=0;prev<i;prev++){
                if(nums[i]%nums[prev]==0 && dp[i]<1+dp[prev]){
                    dp[i] = 1+dp[prev];
                    parent[i] = prev;
                }
            }
        }
        int maxi = 0;
        int lastIndex = 0;
        for(int i=0;i<n;i++){
            if(dp[i]>maxi){
                maxi = dp[i];
                lastIndex = i;
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(parent[lastIndex]!=lastIndex){
            ans.add(nums[lastIndex]);
            lastIndex = parent[lastIndex];

        }
        
        ans.add(nums[lastIndex]);
        Collections.reverse(ans);
        return ans;
    }
}