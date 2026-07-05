class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];
        for(int[] booking : bookings){
            int start = booking[0] - 1;
            int end = booking[1] - 1;
            int seats = booking[2];

            diff[start] += seats;
            if(end + 1<n){
                diff[end + 1]-= seats;
            }

            
        }
        for(int i=1;i<diff.length;i++){
                diff[i] += diff[i-1];
            }
        return diff;
    }
}