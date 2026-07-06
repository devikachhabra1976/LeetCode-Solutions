class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        for(right = 0;right<k;right++){
            sum += nums[right];
        }

        int maxSum = sum;
        for(right = k;right<n;right++){
            sum -= nums[left];
            sum += nums[right];
            left++;

            maxSum = Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
}