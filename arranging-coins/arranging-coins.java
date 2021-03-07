class Solution {
    public int arrangeCoins(int n) {
        for(int i = 1; n > 0; i++){
            if(n-i < 0){
                return i-1;
            }
            if(n-i == 0){
                return i;
            }
            n=n-i;
        }
        return 0;
    }
}