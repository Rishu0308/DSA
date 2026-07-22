class Solution {
    double solve(double x, int n){
        if(n==0){
            return 1;
        }
         double ans = solve(x, n/2);
         if(n%2 == 0){
            return ans * ans;
         }
         return ans * ans * x;
    }
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        return n<0 ? 1/solve(x, n): solve(x, n);
        // double ans = 1
        // if (n==0) {
        //     return 1;
        // }
        // if (n > 0) {
        //     for (double i = 1; i <=n; i++) {
        //         ans = ans * x;
        //     }
        // } else if (n < 0) {
        //     for (double i = n; i<=-1; i++) {
        //         ans = ans * 1/x;
        //     }
        // }
        // return ans;
    }
}