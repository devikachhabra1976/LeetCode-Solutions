class Solution {
    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
        }
    }
}