class Solution {
    public boolean isBinary(int[][] mat,int target){
        int n = mat.length;
        int m = mat[0].length;
        int row = 0;
        int col = m - 1;
        while(row<n && col>=0){
            if(mat[row][col] == target){
                return true;
            }
            else if(mat[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;

       
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target && matrix[i][m-1]>=target){
                if(isBinary(matrix,target)){
                    return true;
                }
            }
        }
        return false;
    }
}