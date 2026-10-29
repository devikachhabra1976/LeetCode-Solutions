class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])){
                int h = heights[st.pop()];
                int left = st.isEmpty()?-1:st.peek();
                int width = i - left - 1;
                int area = h * width;
                maxArea = Math.max(area,maxArea);

            }
            st.push(i);
        }
     return maxArea;   
    }
}