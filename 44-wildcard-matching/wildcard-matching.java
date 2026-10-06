class Solution {
    public boolean solve(int i,int j,String s,String p,int[][] dp){
        if(i<0 && j<0){  //dono string patterns finish ho jate haii...
            return true;
        }
        if(j<0){
            return false;  //pattern finish string remains....w
        }
        if(i<0){
            for(int k=0;k<=j;k++){
                if(p.charAt(k)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j]!=-1) return dp[i][j] == 1;

        boolean ans;
        if(p.charAt(j)==s.charAt(i) || p.charAt(j)=='?'){
            ans = solve(i-1,j-1,s,p,dp);
        }
        else if(p.charAt(j)=='*'){
            boolean one = solve(i-1,j,s,p,dp);
            boolean two = solve(i,j-1,s,p,dp);

            ans  = one||two;
        }
        else{
            ans = false;
        }
        dp[i][j] = ans ? 1:0;
        return ans;

    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,m-1,s,p,dp);


    }
}