class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s=s.trim();
        for(int i = s.length()-1; i>=0; i--){
            if(s.substring(i,i+1).equals(" ")){
                return length;
            }
            length++;
        }
        return length;
    }
}