class Solution {
    private int helper(int idx, int[] nums, int xor){
        if(idx == nums.length) return xor;
        int take = helper(idx + 1, nums, xor ^ nums[idx]);
        int notTake = helper(idx + 1, nums, xor);
        return take + notTake;
    }
    public int subsetXORSum(int[] nums) {
        return helper(0, nums, 0);
    }
}