class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int temp = 0;
        for(int i=0;i<n;i++){
            int rsum = sum - temp - nums[i];

            if(rsum == temp){
                return i;
            }
            temp += nums[i];
        }

        return -1;
    }
}