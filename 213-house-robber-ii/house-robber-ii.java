import java.util.Arrays;

class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 1) {
            return nums[0];
        }

        // Case 1: exclude last house
        int case1 = solveRange(nums, 0, n - 2);

        // Case 2: exclude first house
        int case2 = solveRange(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int solveRange(int[] nums, int start, int end) {

        int n = nums.length;

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        return solve(end, start, nums, dp);
    }

    public int solve(int i, int start, int[] arr, int[] dp) {

        if(i < start) {
            return 0;
        }

        if(i == start) {
            return arr[i];
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int pick = arr[i] + solve(i - 2, start, arr, dp);

        int nP = solve(i - 1, start, arr, dp);

        dp[i] = Math.max(pick, nP);

        return dp[i];
    }
}