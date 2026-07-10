class Solution {
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void computeRes(int i, int[] nums, int n, List<List<Integer>> res){
        if(i == nums.length){
            List<Integer> li = new ArrayList<>();
            for(int num: nums){
                li.add(num);
            }
            res.add(li);
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int j = i; j<n; j++){
            if(set.contains(nums[j])) continue;
            set.add(nums[j]);
            swap(i, j, nums);
            computeRes(i+1, nums, n, res);
            swap(i, j, nums);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        computeRes(0, nums, nums.length, res);
        return res;
    }
}