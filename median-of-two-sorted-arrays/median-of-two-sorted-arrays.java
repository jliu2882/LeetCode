class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int one = 0;
        int two = 0;
        int[] sorted = new int[nums1.length+nums2.length];
        for(int i = 0; i < sorted.length; i++){
            if(one>=nums1.length){
                sorted[i]=nums2[two];
                two++;
                continue;
            }
            if(two>=nums2.length){
                sorted[i]=nums1[one];
                one++;
                continue;
            }
            if(nums1[one]<nums2[two]){
                sorted[i]=nums1[one];
                one++;
            }
            else{
                sorted[i]=nums2[two];
                two++;
            }
        }
        if(sorted.length==0){
            return 0;
        }else if(sorted.length%2==0){
            return (double)((sorted[sorted.length/2-1]+sorted[sorted.length/2])/2.0);
        }else{
            return sorted[sorted.length/2];
        }
    }
}