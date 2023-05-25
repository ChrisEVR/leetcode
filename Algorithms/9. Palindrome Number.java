class Solution {
    public boolean isPalindrome(int x) {
        short revNum = 0;

        if(x < 0 || x != 0 && x % 10 == 0) return false;

        while(x > revNum){
            revNum = (short)(revNum * 10 + x % 10);
            x /= 10;
        }

        return revNum == x || revNum / 10 == x;
    }
}