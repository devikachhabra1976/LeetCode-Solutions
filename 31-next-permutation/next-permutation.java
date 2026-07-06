class Solution {
    public void reverse(int[] arr,int a,int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot!=-1){
            for(int i=n-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }

            
        }
        reverse(nums,pivot+1,n-1);
    }
}