class Solution {
    public int[] minOperations(String boxes) {
        int[] minOp = new int[boxes.length()];
        for(int i = 0; i < minOp.length; i++){
            minOp[i] = findOp(boxes,i);
        }
        return minOp;
    }
    public int findOp(String box, int index){
        int sum = 0;
        for(int i = 0; i < box.length(); i++){
            sum+=Integer.parseInt(box.substring(i,i+1))*Math.abs(i-index);
        }
        return sum;
    }
}