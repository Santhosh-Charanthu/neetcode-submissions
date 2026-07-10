class Solution {
    private void computeRes(StringBuilder sb, List<String> res, int n, int open, int close){
        if(open + close == 2 * n){
            res.add(new String(sb.toString()));
            return;
        }
        if(open < n){
            sb.append("(");
            computeRes(sb, res, n, open+1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open){
            sb.append(")");
            computeRes(sb, res, n, open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        computeRes(new StringBuilder(), res, n, 0, 0);
        return res;
    }
}
