class Solution {
    public boolean detectCapitalUse(String word) {
        boolean caps = Character.isUpperCase(word.charAt(0));
        if(caps && word.length()>1){
            caps = Character.isUpperCase(word.charAt(1));
        }
        for(int i = 1; i < word.length(); i++){
            if(caps?!Character.isUpperCase(word.charAt(i)):Character.isUpperCase(word.charAt(i))){
                 return false;
            }
        }
        return true;
    }
}