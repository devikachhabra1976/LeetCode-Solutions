class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int no = nums.length;

        for(int i=0;i<no;i++){
            set.add(nums[i]);
        }
        int longest = 0;
        for(int n:set){
            if(!set.contains(n-1)){
                int len = 1;
                while(set.contains(n+len)){
                    len++;
                    
                }
                longest = Math.max(len,longest);

            }
        }
        return longest;
    }
}