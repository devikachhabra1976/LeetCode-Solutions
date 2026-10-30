class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int r=0;r<n;r++){
            sum += nums[r];
            if(r-left+1==k){
                max = Math.max(sum,max);
                sum-=nums[left];
                left++;
            }
        }
        return (double)max/k;
    }
}