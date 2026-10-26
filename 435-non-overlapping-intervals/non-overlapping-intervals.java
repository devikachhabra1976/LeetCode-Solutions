class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int remove = 0;
        int lastIndex = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<lastIndex){
                remove++;
            }
            else{
                lastIndex = intervals[i][1];
            }
        }
        return remove;

    }
}