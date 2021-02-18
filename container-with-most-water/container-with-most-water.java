class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = 0; j < height.length; j++){
                if(getArea(i,j,height[i],height[j])>max){
                    max = getArea(i,j,height[i],height[j]);
                }
            }
        }
        return max;
    }
    public int getArea(int first, int second, int firstHeight, int secondHeight){
        int minHeight = firstHeight>secondHeight?secondHeight:firstHeight;
        return (second-first)*minHeight;
    }
}