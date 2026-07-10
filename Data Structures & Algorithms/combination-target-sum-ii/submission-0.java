class Solution {
    private void computeRes(int idx, int target, int[] candidates, int n, List<Integer> li, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(li));
            return;
        }
        if(target < 0 || idx == n) return;
        for(int i = idx; i<n; i++){
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            li.add(candidates[i]);
            computeRes(i+1, target - candidates[i], candidates, n, li, res);
            li.remove(li.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        computeRes(0, target, candidates, candidates.length, new ArrayList<>(), res);
        return res;
    }
}
