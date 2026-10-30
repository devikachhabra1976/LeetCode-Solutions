class Solution {
    public int subarraysWithKDistinct(int[] nums, int k){
        return res(nums,k)-res(nums,k-1);
    }
    public int res(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);

                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }

                left++;
            }
            count+=(r-left+1);
        }
    return count;
    }
}