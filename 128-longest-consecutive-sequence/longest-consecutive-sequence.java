class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int n : set){
            if(!set.contains(n-1)){
                int len = 1;

                while(set.contains(n+len)){
                    len++;
                }
                longest = Math.max(longest,len);
            }
        }
        return longest;
    }
}