class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(
            ruleKey.equals("type")?0:(ruleKey.equals("color")?1:2)
            ).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}