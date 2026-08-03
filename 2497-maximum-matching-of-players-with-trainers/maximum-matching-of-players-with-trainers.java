class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int p = players.length;
        int t = trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);

        int cp = 0;
        int ct = 0;
        int count = 0;
        while(cp<p && ct<t){
            if(players[cp]<=trainers[ct]){
                count++;
                cp++;
                ct++;
            }
            else{
                ct++;
            }
        }
        return count;

    }
}