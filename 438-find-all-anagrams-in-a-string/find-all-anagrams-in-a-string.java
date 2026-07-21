class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        int[] pCount =  new int[26];
        int[] windowCount = new int[26];
        for(char c : p.toCharArray()){
            pCount[c-'a']++;
        }

        int winSize = p.length();

        for(int i=0;i<s.length();i++){
            windowCount[s.charAt(i)-'a']++;


            if(i>=winSize){
                windowCount[s.charAt(i-winSize)-'a']--;
            }

            if(Arrays.equals(pCount,windowCount)){
                ans.add(i-winSize+1);
            }
        
     }
     return ans;
     
}
}