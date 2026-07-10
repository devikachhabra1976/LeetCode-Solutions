class Solution {
    public int sum(int[] arr,int b){
        int sum = 0;
        for(int a:arr){
            sum +=  Math.ceil((double)a/b);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n =  nums.length;
        int low = 1;

        int high = 0;
        for(int num : nums){
            high = Math.max(num,high);
        }
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(sum(nums,mid)<=threshold){
                ans= mid;
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
            

        }
        return ans;
    }
}