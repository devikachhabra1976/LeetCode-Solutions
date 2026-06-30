class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int max = 0;
        for(int right = 0;right<n; right++){
            if(nums[right] == 0){
                left = right + 1;
            }

            max = Math.max(max,right-left+1);

        }
        return max;
    }
}