class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for(int g : gas) totalGas+=g;
        for(int c:cost) totalCost += c;

        if(totalCost> totalGas) return -1;
        int startIdx = 0;
        int totalFuel = 0;
        for(int i=0;i<gas.length;i++){
            totalFuel += gas[i] - cost[i];
            if(totalFuel < 0){
                startIdx = i + 1;
                totalFuel = 0;
            }
        }
        return startIdx;
    }
}