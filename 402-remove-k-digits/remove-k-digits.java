class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        if(num.length() == k) return "0";
        for(char c:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;

            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();

        while(ans.length()>1 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }
}