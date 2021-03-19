class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String newS = "";
        for(int i = 0; i < S.length(); i++){
            if(!S.substring(i,i+1).equals("-")){
                newS+=S.substring(i,i+1);
            }
        }
        if(newS.length()==0){
            return newS;
        }
        newS=newS.toUpperCase();
        S=newS.substring(0,newS.length()%K);
        for(int i = newS.length()%K; i < newS.length(); i=i+K){
            S+="-"+newS.substring(i,i+K);
        }
        if(S.substring(0,1).equals("-")){
            S=S.substring(1);
        }
        return S;
    }
}