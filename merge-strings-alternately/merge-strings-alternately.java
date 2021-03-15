class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word = "";
        for(int i = 0; i < word1.length() && i < word2.length(); i++){
            word+=word1.substring(i,i+1)+word2.substring(i,i+1);
        }
        word+=word1.length()>word2.length()?word1.substring(word2.length()):word2.substring(word1.length());
        
        return word;
    }
}