class Solution {
    private void computeRes(int num, int n, int k, List<Integer> li, List<List<Integer>> res){
        if(li.size() == k){
            res.add(new ArrayList<>(li));
            return;
        }
        if(num > n) return;
        li.add(num);
        computeRes(num+1, n, k, li, res);
        li.remove(li.size()-1);
        computeRes(num+1, n, k, li, res);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        computeRes(1, n, k, new ArrayList<>(), res);
        return res;
    }
}