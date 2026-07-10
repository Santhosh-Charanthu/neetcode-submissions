class Solution {
    private void computeRes(int st, int end, int k, List<Integer> li, List<List<Integer>> res){
        if(li.size() == k){
            res.add(new ArrayList<>(li));
            return;
        }
        if(st > end) return;
        li.add(st);
        computeRes(st+1, end, k, li, res);
        li.remove(li.size()-1);
        computeRes(st+1, end, k, li, res);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        computeRes(1, n, k, new ArrayList<>(), res);
        return res;
    }
}