class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        if(Arrays.equals(sChars, tChars)) return true;
        return false;
    }
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     List<List<String>> res = new ArrayList<>();
    //     int n = strs.length;
    //     boolean[] vis = new boolean[n];
    //     for(int i = 0; i<n; i++){
    //         if(vis[i]) continue;
    //         vis[i] = true;
    //         String str1 = strs[i];
    //         List<String> li = new ArrayList<>();
    //         li.add(str1);
    //         for(int j = 0; j<n; j++){
    //             if(vis[j]) continue;
    //             if(i == j) continue;
    //             String str2 = strs[j];
    //             if(isAnagram(str1, str2)){
    //                 li.add(str2);
    //                 vis[j] = true;
    //             }
    //         }
    //         res.add(li);
    //     }
    //     return res;
    // }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String newStr = new String(charArr);
            if(!map.containsKey(newStr)){
                map.put(newStr, new ArrayList<>());
            }
            map.get(newStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
