class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = s.length()>0?1:0;
        for(int i = 0;  i < s.length(); i++){
            if(checkString(s, i) > maxLength){
                maxLength = checkString(s, i);
            }
        }
        return maxLength;
    }
    public int checkString(String s, int index){
        for(int i = index+1; i < s.length(); i++){
            if(s.substring(index,i).contains(s.substring(i,i+1))){
                return i-index;
            }
        }
        return s.length()-index;
    }
}