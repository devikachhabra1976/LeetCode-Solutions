class Solution {
    public int lowerBound(int[] arr,int x){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low<=high){
            int mid = low+(high - low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;

    }

    public int upperBound(int[] arr,int x){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums,target);
        if(lb == nums.length || nums[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,upperBound(nums,target)-1};
    }
}