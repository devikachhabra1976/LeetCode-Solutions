class Solution {
    public int largestRectangle(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || arr[st.peek()]>= arr[i])){
                int h = arr[st.pop()];
                int left = st.isEmpty() ? -1 : st.peek();
                int w = i - left - 1;
                int area = h * w;
                maxArea = Math.max(area,maxArea);
            }
            st.push(i);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        
        int row = matrix.length;
        int col = matrix[0].length;
        int[] height = new int[col];
        int maxArea = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] =='1'){
                    height[j]++;
                }
                else{
                    height[j] = 0;
                }

                
            }
            maxArea = Math.max(maxArea,largestRectangle(height));
        }
        return maxArea;
    }
}