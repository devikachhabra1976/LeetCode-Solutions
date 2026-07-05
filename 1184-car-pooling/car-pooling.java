class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[] diff = new int[1001];
        for(int[] trip : trips){
            int first = trip[1];
            int last = trip[2];
            int pass = trip[0];

            diff[first]+=pass;
            
                diff[last] -= pass;
        
        }
        

        int sum = 0;
        for(int i=0;i<1001;i++){
            sum += diff[i];
            
        if(sum > capacity){
            return false;
        }

       
        }

        return true;
    }
}