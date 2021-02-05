class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] firstArr = new int[m];
        for(int i =0; i < m;i++){
            firstArr[i]=nums1[i];
        }
        int firstIndex=0,secondIndex=0;
        for(int i = 0; i <nums1.length;i++){
            if(firstIndex>=m){
                nums1[i]=nums2[secondIndex];
                secondIndex++;
                continue;
            }
            if(secondIndex>=n){
                nums1[i]=firstArr[firstIndex];
                firstIndex++;
                continue;
            }
            if(firstArr[firstIndex]<nums2[secondIndex]){
                nums1[i]=firstArr[firstIndex];
                firstIndex++;
            }
            else {
                nums1[i]=nums2[secondIndex];
                secondIndex++;
            }
        }
    }
}