class Solution {
    public int helper(int[] nums,int k){
        int max = 0;
        int left = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);

                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }

            max+=(right-left+1);
        }
        return max;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);

    }
}