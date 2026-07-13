class Solution {
    public boolean binary(int[] row,int target,int low,int high){

        
        while(low<=high){
            int mid = low + (high - low)/2;

            if(row[mid] == target){
                return true;
            }
            if(row[mid]<target){
                low = mid + 1;
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
                if(binary(matrix[i],target,0,m-1)) return true;
            }
        }
        return false;
    }
}