class Solution {
    private int maxCost(int idx, int[] nums, int[] dp){
        if(idx == 0) return nums[0];
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx];
        int take = nums[idx] + maxCost(idx-2, nums, dp);
        int notTake = maxCost(idx-1, nums, dp);
        return dp[idx] = Math.max(take, notTake);
    }
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int[] dp = new int[n];
    //     Arrays.fill(dp, -1);
    //     return maxCost(n-1, nums, dp);
    // }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int idx = 1; idx<n; idx++){
            int take = nums[idx];
            if(idx-2 >= 0) take += dp[idx-2];
            int notTake = dp[idx-1];
            dp[idx] = Math.max(take, notTake);
        }
        return dp[n-1];
    }
}
