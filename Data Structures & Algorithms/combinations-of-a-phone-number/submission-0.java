class Solution {
    private void initializeMap(HashMap<Character, String> map){
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    private void helper(int idx, String digits, StringBuilder sb, HashMap<Character, String> map, List<String> res){
        if(idx == digits.length()){
            if(sb.length() > 0) res.add(sb.toString());
            return;
        }
        char digit = digits.charAt(idx);
        String comb = map.get(digit);
        for(int i = 0; i<comb.length(); i++){
            sb.append(comb.charAt(i));
            helper(idx+1, digits, sb, map, res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        initializeMap(map);
        List<String> res = new ArrayList<>();
        helper(0, digits, new StringBuilder(), map, res);
        return res;
    }
}
