class Solution {
    public boolean isAnagram(String s, String t) {
        final short[] alphabet = new short[27];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); ++i){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for(char i = 'a'; i <= 'z'; ++i) if(alphabet[i - 'a'] != 0) return false;

        return true;
    }
}