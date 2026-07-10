class Solution {
    private void computeRes(int idx, int[] nums, List<Integer> li, List<List<Integer>> res){
        if(idx == nums.length){
            res.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[idx]);
        computeRes(idx + 1, nums, li, res);
        li.remove(li.size() - 1);
        computeRes(idx + 1, nums, li, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        computeRes(0, nums, new ArrayList<>(), res);
        return res;
    }
}
