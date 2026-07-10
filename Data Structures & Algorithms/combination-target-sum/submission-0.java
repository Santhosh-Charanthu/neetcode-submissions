class Solution {
    private void computeRes(int idx, int[] nums, int target, List<Integer> li, List<List<Integer>> res){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(li));
            return;
        }
        if(idx == nums.length) return;
        li.add(nums[idx]);
        computeRes(idx, nums, target-nums[idx], li, res);
        li.remove(li.size()-1);
        computeRes(idx + 1, nums, target, li, res);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        computeRes(0, nums, target, new ArrayList<>(), res);
        return res;
    }
}
