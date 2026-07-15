class Solution {
    public boolean binary(int[][] mat,int target){
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = n *m -1;
        while(low<=high){
            int mid = low+(high - low)/2;
            int row = mid/m;
            int col = mid%m;
            if(mat[row][col] == target){
                return true;
            }
            else if(mat[row][col]<target){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
        
        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target && matrix[i][m-1]>=target){
                if(binary(matrix,target)) return true;
            }
        }
        return false;
    }
}