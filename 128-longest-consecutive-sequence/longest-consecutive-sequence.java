class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set  = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int longest = 0;
        for(int a:set){
            if(!set.contains(a-1)){
                int len = 1;
                while(set.contains(a+len)){
                    len++;
                    
                }

                longest = Math.max(longest,len);
            }

        }
        return longest;
    }
}