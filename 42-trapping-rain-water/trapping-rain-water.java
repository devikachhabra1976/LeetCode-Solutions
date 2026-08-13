class Solution {
    public int trap(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int water = 0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int bottom = st.pop();

                if(st.isEmpty()){
                    break;
                }
                int left = st.peek();

                int width = i - left - 1;
                int minHeight = Math.min(height[left],height[i]);
                water+=width * (minHeight - height[bottom]);

            }
            st.push(i);

        }
        return water;
    }
}