class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int max =0;
        for(int i=0;i<n;i++){
            if(boxTypes[i][0]<=truckSize){
                max += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                int u = boxTypes[i][0] - truckSize;
                
                max += truckSize * boxTypes[i][1];
                truckSize -= truckSize;

                
            }

        }
        return max;
    }
}  