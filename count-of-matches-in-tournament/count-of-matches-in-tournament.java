class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while(n>1){
            matches+=calcMatches(n);
            if(n%2==0){
                n/=2;
            } else{
                n=(n-1)/2+1;
            }
        }
        return matches;
    }
    public int calcMatches(int n){
        if(n%2==0){
            return n/2;
        } else{
            return (n-1)/2;
        }
    }
}