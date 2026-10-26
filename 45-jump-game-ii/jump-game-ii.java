class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int far = 0;
        int jumps = 0;
        for(int i=0;i<n-1;i++){
            far = Math.max(far,nums[i]+i);

            if(i==end){
                jumps++;
                end = far;
            }
        }
        return jumps;
    }
}