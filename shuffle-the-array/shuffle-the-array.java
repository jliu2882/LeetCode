class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[2*n];
        for(int i = 0; i < nums.length; i++){
            if(i%2==0){
                newArr[i]=nums[(int)(i/2)];
            } else{
                newArr[i]=nums[(int)(i/2)+n];
            }
        }
        return newArr;
    }
}