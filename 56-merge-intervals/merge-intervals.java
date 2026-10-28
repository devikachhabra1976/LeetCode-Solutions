class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));


        List<int[]> res = new ArrayList<>();
        for(int[] curr:intervals){
            if(res.isEmpty()|| curr[0]>res.get(res.size()-1)[1]){
                res.add(curr);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],curr[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}