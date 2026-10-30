class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[st.peek()]<=height[i]){
                int bottom = st.pop();
                if(st.isEmpty()){
                    break;
                }
                int left = st.peek();
                int w = i - left - 1;
                int minHeight = Math.min(height[left],height[i]);
                water+= w*(minHeight-height[bottom]);

            }
            st.push(i);
        }

         return water;
    }
   
}