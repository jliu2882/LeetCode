class Solution {
    public int subtractProductAndSum(int n) {
        //modulo? stringiiy?
        String num = Integer.toString(n);
        int sum = 0;
        int product = 1;
        for(int i = 0; i < num.length(); i++){
            sum+=Integer.valueOf(num.substring(i,i+1));
            product*=Integer.valueOf(num.substring(i,i+1));
        }
        return product - sum;
    }
}