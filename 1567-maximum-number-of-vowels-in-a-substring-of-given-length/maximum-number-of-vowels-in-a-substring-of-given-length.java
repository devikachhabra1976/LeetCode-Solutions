class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0;i<k;i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' ||c=='o' || c=='u'){
                count++;
            }
        }

        int l = 0;
        int r = 0;
        int max = count;
        for(int i=k;i<s.length();i++){
            char left = s.charAt(l);
            if(left=='a' || left=='e' || left=='i' || left=='o' || left=='u'){
                count--;
            }
            char rt = s.charAt(i);
            if(rt=='a' || rt=='e' || rt=='i' || rt=='o' || rt=='u'){
                count++;
            }
            l++;
             max = Math.max(count,max);
            
        }
       
        return max;
    }
}