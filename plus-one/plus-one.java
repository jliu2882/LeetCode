class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==1 && digits[0]!=9){
            digits[0]++;
            return digits;
        }
        return digitUp(digits,digits.length-1);
    }
    public static int[] digitUp(int[] digits, int index){
        if(index==-1){
            int[] allNines = new int[digits.length+1];
            allNines[0]=1;
            return allNines;
        }
        if(digits[index]==9){
            digits[index]=0;
            return digitUp(digits,index-1);
        }
        else{
            digits[index]++;
            return digits;
        }
    }
}