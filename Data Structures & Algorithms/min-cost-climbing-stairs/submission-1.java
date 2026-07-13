class Solution {
    private int minCost(int idx, int[] cost, int totalCost, int[] dp){
        if(idx >= cost.length) return totalCost;
        if(dp[idx] != -1) return dp[idx];
        int oneStep = minCost(idx + 1, cost, totalCost, dp);
        int twoSteps = minCost(idx + 2, cost, totalCost, dp);
        return dp[idx] = cost[idx] + Math.min(oneStep, twoSteps);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        // int fromStepOne = minCost(0, cost, 0, dp);
        int last = minCost(0, cost, 0, dp);
        for(int i = 0; i<n; i++){
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        Arrays.fill(dp, -1);
        int fromStepTwo = minCost(1, cost, 0, dp);
        for(int i = 0; i<n; i++){
            System.out.print(dp[i] + " ");
        }
        return Math.min(last, dp[1]);
    }
}
