class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return solve(0,0,n,triangle,dp);
    }

    public int solve(int i,int j,int n,List<List<Integer>> tri,int[][] dp){
        if(i==n-1) return tri.get(i).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int right = solve(i+1,j,n,tri,dp);
        int down = solve(i+1,j+1,n,tri,dp);
        dp[i][j] = tri.get(i).get(j) + Math.min(right,down);
        return dp[i][j];
    }
}