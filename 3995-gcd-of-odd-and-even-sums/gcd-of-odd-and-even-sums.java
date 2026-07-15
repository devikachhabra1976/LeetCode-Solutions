class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int rem = a % b;
             a = b;
             b = rem;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sum1 = n*(n+1);
        int sum2 = n*n;
        


int ans = gcd(sum2,sum1);
return ans;


    }
}