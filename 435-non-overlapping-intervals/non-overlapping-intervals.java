class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

        int last = intervals[0][1];
        int remove = 0;
        for(int i=1;i<n;i++){
            if(intervals[i][0]<last){
                remove++;
            }
            else{
                last = intervals[i][1];
            }
        }
        return remove;
    }
}