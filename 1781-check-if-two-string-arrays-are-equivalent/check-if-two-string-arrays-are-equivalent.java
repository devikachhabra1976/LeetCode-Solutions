class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for(String c:word1){
            sb1.append(c);
        }

         StringBuilder sb2 = new StringBuilder();
        for(String c:word2){
            sb2.append(c);
        }

        return sb1.toString().equals(sb2.toString());
    }
}