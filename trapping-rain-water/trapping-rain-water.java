class Solution {
    public int trap(int[] height) {
        int water = 0;
        int leftWallH = 0;
        for(int i = 0; i < height.length; i++){
            water+=getWater(leftWallH, height[i]);
            leftWallH=findNewHeight(leftWallH, i, height);
        }
        return water;
    }
    public int getWater(int leftWallH, int currentH){
        return (leftWallH-currentH)>0?(leftWallH-currentH):0;
    }
    public int findNewHeight(int leftWall, int index, int[] map){
        int height = (leftWall>map[index])?leftWall:map[index];
        for(int i = index+1; i < map.length; i++){
            if(map[i]>=height){
                return height;
            }
        }
        return nextHeight(index, map);
    }
    public int nextHeight(int index, int[] map){
        int max = 0;
        for(int i = index+1; i<map.length; i++){
            if(map[i]>max){
                max = map[i];
            }
        }
        return max;
    }
}