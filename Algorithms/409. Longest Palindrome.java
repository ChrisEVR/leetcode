class Solution {
    public int longestPalindrome(String s) {
        short ans = 0;
        boolean[] count = new boolean[128];

        for(char c : s.toCharArray()){
            if(count[c]){
                count[c] = false;
                ans += 2;
            }else count[c] = true;
        }

        for(boolean exists : count) 
            if(exists){
                ans++;
                break;
            }

        return ans;
    }
}