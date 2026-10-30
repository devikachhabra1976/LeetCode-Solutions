class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
      
        int left =0;
        for(int i=0;i<k;i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }

        int right = 0;
        int max = count;
        
        for(int i=k;i<s.length();i++){
            char lc= s.charAt(left);
            if(lc=='a' || lc=='e' || lc=='i' ||lc=='o' || lc=='u'){
                count--;
            } 
            char rc = s.charAt(i);
            if(rc=='a' || rc=='e' ||rc=='i' || rc=='o' || rc=='u'){
                count++;
            }
            left++;
            max = Math.max(max,count);


        }
        return max;
    }
}