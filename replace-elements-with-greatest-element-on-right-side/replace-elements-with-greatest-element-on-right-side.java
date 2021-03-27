class Solution {
    public int[] replaceElements(int[] arr) {
        int[] replaced = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int greatest = -1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]>greatest){
                    greatest = arr[j];
                }
            }
            replaced[i] = greatest;
        }
        return replaced;
    }
}