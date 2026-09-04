class Solution {
    private boolean isPalindrome(int i, int j, String s){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    private void helper(int st, String s, List<String> path, List<List<String>> res){
        if(st == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int end = st; end < s.length(); end++){
            if(isPalindrome(st, end, s)){
                path.add(s.substring(st, end+1));
                helper(end+1, s, path, res);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(0, s, new ArrayList<>(), res);
        return res;
    }
}
