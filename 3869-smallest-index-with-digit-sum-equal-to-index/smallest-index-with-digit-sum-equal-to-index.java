class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
       
        for(int i=0;i<n;i++){
            int sum = 0;
            int temp = nums[i];
            while(temp != 0){
                int d = temp%10;
                sum += d;
                temp = temp/10;
            }
            if(i==sum){
                return i;
            }
        }
        return -1;
        
    }
}