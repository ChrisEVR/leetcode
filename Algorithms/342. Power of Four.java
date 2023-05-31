class Solution {
    public boolean isPowerOfFour(int n) {
        return n == 0 ? false : Math.ceil(Math.log(n) / Math.log(4)) == Math.log(n) / Math.log(4);
    }
}