class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        double[] res = new double[n/2];
        int i=0;
        int j = n - 1;
        int k = 0;
        while(i<j){
            int max = nums[i];
            int min = nums[j];
            double avg = (min+max)/2.0;
            res[k++] = avg;
            i++;
            j--;
        }

        double a = res[0];
        for(int r=1;r<n/2;r++){
            if(res[r]<a){
                a = res[r];
            }
        }
        return a;

    }
}