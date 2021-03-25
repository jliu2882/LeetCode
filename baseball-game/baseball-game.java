class Solution {
    public int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<Integer>();
        for(int i = 0; i < ops.length; i++){
            switch(ops[i]){
                case "D":
                    scores.add(2*scores.get(scores.size() - 1));
                    break;
                case "C":
                    scores.remove(scores.size() - 1);
                    break;
                case "+":
                    scores.add(scores.get(scores.size() - 1)+scores.get(scores.size() - 2));
                    break;
                default:
                    scores.add(Integer.valueOf(ops[i]));
            }
        }
        int sum = 0;
        for(int i =0 ; i< scores.size(); i++){
            sum+=scores.get(i);
        }
        return sum; 
    }
}