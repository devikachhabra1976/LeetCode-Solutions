class Solution {
public:
    int sum(int n){
        int sum = 0;
        while(n!=0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
    int product(int n){
        int product = 1;
        while(n!=0){
            int digit = n % 10;
            product *= digit;
            n = n / 10;
        }
        return product;
    }
    bool checkDivisibility(int n) {
        int result = sum(n)+product(n);
        if(n % result != 0){
            return 0;
        }
        return 1;
    }
};