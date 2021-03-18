class Solution {
    public boolean isPowerOfThree(int n) {
        double n2 = n;
        while(n2>1){
            n2/=3.0;
        }
        return n2==1;
    }
}