class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < result.length; i++){
            result[i] = check(nums[i],nums);
        }    
        return result;
    }
    public int check(int num, int[] nums){
        int numGreater = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]<num){
                numGreater++;
            }
        }
        return numGreater;
    }
}