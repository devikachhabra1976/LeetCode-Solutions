class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){  //window size (if k = 3 it will be till index one less so k - 1 as 0 based indexing)
                ans[i-k+1] = nums[dq.peekFirst()]; //(i-k+1 is acc to 0 based indexing agar 2 pe ek qindow khatam hogyi to ans array mai 0 index pe store hoga so 2-3+1 = 0)
            }
        }
        return ans;
    }
}