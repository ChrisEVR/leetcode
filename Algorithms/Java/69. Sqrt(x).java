class Solution {
    public int mySqrt(int x) {
        int i = 0;

        while(i * i < x && i * i >= 0) i++;

        return i * i == x ? i : i - 1;
    }
}