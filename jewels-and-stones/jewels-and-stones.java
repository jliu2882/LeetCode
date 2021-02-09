class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelCount = 0;
        for(int i = 0; i < stones.length();i++){
            if(isJewel(jewels,stones.substring(i,i+1))){
                jewelCount++;
            }
        }
        return jewelCount;
    }
    public boolean isJewel(String jewels, String stone){
        for(int i = 0; i< jewels.length(); i++){
            if(stone.equals(jewels.substring(i,i+1))){
                return true;
            }
        }
        return false;
    }
}