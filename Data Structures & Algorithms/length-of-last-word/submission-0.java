class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        for(int i = words.length-1; i >= 0; i--){
            if(words[i].length() > 0){
                return words[i].length();
            }
        }
        return 1;
    }
}