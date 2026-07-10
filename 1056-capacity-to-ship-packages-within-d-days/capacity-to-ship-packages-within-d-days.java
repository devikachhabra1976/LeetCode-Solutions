class Solution {
    public int reqDays(int[] weights,int capacity){
        int days  = 1;
        int load = 0;
        for(int weight:weights){
            if(load+weight<=capacity){
                load += weight;
            }
            else{
                days++;
                load = weight;
            }

        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0;
        int sum = 0;
        for(int w:weights){
            low = Math.max(w,low);
            sum += w;
        }
        int high = sum;
       int ans =  0;
        while(low<=high){
            int mid = low + (high - low)/2;

            if(reqDays(weights,mid)<=days){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
            
        }
        return ans;
        
    }
}