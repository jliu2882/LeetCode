class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++){
            list.add(greatest(candies,i,extraCandies));
        }
        return list;
    }
    public boolean greatest(int[] candies, int index, int extra){
        int max = candies[index]+extra;
        for(int i = 0; i < candies.length; i++){
            if(candies[i]>max){
                return false;
            }
        }
        
        return true;
    }
}