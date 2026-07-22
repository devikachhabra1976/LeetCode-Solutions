class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> ST = new HashMap<>();
        HashMap<Character,Character> TS = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(ST.containsKey(c1)){
                if(ST.get(c1)!=c2){
                    return false;
                }
            }
            else{
                ST.put(c1,c2);
            }


            if(TS.containsKey(c2)){
                if(TS.get(c2)!=c1){
                    return false;
                }
            }
            else{
                TS.put(c2,c1);
            }
        }

        return true;


    }
}