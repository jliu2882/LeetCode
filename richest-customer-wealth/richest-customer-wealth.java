class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = sum(accounts[0]);
        for(int i = 0; i<accounts.length; i++){
            if(sum(accounts[i])>maxWealth){
                maxWealth = sum(accounts[i]);
            }
        }
        return maxWealth;
    }
    public int sum(int[] customer){
        int wealth = 0;
        for(int i = 0; i < customer.length; i++){
            wealth+=customer[i];
        }
        return wealth;
    }
}