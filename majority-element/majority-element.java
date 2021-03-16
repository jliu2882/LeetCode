class Solution {
    public int majorityElement(int[] nums) {
        int currentElement=0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==currentElement && count!=0){
                count++;
            } else if(count==0){
                currentElement = nums[i];
                count++;
            }
            else{
                count--;
            }
        }
        return currentElement;
    }
}