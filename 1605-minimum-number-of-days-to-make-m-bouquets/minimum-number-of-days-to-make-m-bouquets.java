class Solution {
    public boolean canMake(int[] arr,int day,int m,int k){
        int flowers = 0;
        int bouquets = 0;
       for (int x : arr) {

    if (x <= day) {

        flowers++;

        if (flowers == k) {
            bouquets++;
            flowers = 0;
        }

    } else {

        flowers = 0;
    }
}
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long totalFlowers = (long) m*k;
        if(totalFlowers>n){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int bloom:bloomDay){
            low = Math.min(low,bloom);
            high = Math.max(high,bloom);

        }
        int ans = high;
        while(low<=high){
            int mid = low + (high - low)/2;

            if(canMake(bloomDay,mid,m,k)){
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