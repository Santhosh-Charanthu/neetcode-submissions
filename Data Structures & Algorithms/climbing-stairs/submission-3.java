class Solution {
    private int totalWays(int idx, int[] dp){
        if(idx == 0) return 1;
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx];
        int stepOne = totalWays(idx-1, dp);
        int stepTwo = totalWays(idx-2, dp);
        return dp[idx] = stepOne + stepTwo;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // totalWays(n, dp);
        // return dp[n];
        dp[0] = 1;
        for(int i = 1; i<=n; i++){
            int stepOne = dp[i-1];
            int stepTwo = 0;
            if(i-2 >= 0) stepTwo = dp[i-2];
            dp[i] = stepOne + stepTwo;
        }
        return dp[n];
    }
}