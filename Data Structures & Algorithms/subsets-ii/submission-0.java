class Solution {
    private void computeRes(int idx, int[] nums, int n, List<Integer> li, List<List<Integer>> res){
        res.add(new ArrayList<>(li));
        for(int i = idx; i<n; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            li.add(nums[i]);
            computeRes(i+1, nums, n, li, res);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        computeRes(0, nums, nums.length, new ArrayList<>(), res);
        return res;
    }
}
