class Solution {
    
    public int climbStairs(int n) {
        int prev = 2, secondPrev = 1, total = 0;

        if(n <= 2) return n;

        for(int i = 2; i < n; ++i){
            total = prev + secondPrev;
            secondPrev = prev;
            prev = total;
        }

        return total;
    }
}